import java.util.concurrent.Executor;
import java.util.concurrent.ConcurrentLinkedQueue;


public class ExecutorImpl implements Executor {

	
	ConcurrentLinkedQueue<Runnable> queue;
	int threadLimit;
	int threadCount;
	
	public ExecutorImpl(int threadLimit){
		queue = new ConcurrentLinkedQueue<Runnable>();
		this.threadLimit = threadLimit;
		Thread t= new Thread(new ThreadManager(0, threadLimit, queue));
		t.start();
		//this.manageThreads();
	}
	
	@Override
	public void  execute(Runnable command) {
		queue.add(command);
	}
	
}
