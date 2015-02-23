import java.util.concurrent.Executor;
import java.util.concurrent.ConcurrentLinkedQueue;


public class ExecutorImpl implements Executor {

	
	ConcurrentLinkedQueue<Runnable> queue;
	int threadLimit;
	
	public ExecutorImpl(int threadLimit){
		queue = new ConcurrentLinkedQueue<Runnable>();
		this.threadLimit = threadLimit;
		this.threadManager();
	}
	
	@Override
	public void execute(Runnable command) {
		queue.add(command);
		notifyAll();
	}
	
	private void threadManager(){
		while (true){
			if (checkAddThreads()){
				Thread t = new Thread(queue.remove());
				t.start();
			}else{
				try{
					wait();
				}catch (InterruptedException ex){
					System.out.println("Debug: Notification Recieved");
				}finally{
					System.out.println("Debug: TM Finally Called");
				}
			}
		}
	}
	
	private boolean checkAddThreads(){
		return Thread.activeCount()<= threadLimit && !queue.isEmpty();
	}
}
