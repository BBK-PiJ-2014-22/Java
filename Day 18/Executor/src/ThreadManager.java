import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;


public class ThreadManager implements Runnable{
	
	int threadCount;
	int threadLimit;
	ConcurrentLinkedQueue<Runnable> queue;
	List<Thread> activeThreads; 
	
	public ThreadManager(int threadCount, int threadLimit, ConcurrentLinkedQueue<Runnable> queue){
		this.threadCount = threadCount;
		this.threadLimit = threadLimit;
		this.queue = queue;
		this.activeThreads = new CopyOnWriteArrayList();
	}
	
	@Override
	public synchronized void run() {
		while (true){
			if ((threadCount <= threadLimit)&& !queue.isEmpty()){
				Thread t = new Thread(queue.poll());
				threadCount += 1;
				activeThreads.add(t);
				t.start();
			}else{
				try{
					wait(1000);
					for (int i = activeThreads.size()-1 ; i >= 0 ; i--){
						if (!activeThreads.get(i).isAlive())
							activeThreads.remove(i);
					}
					
				}catch (InterruptedException ex){
					//Do nothing just wait less time if a thread happens to notify
				}
			}
		}
		
	}


}
