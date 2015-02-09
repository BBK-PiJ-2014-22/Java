import java.util.Queue;

public class Task implements Runnable {
	
	int taskNumber;
	int time;
	Queue<Integer> resultsQueue;
	
	public Task(int taskNumber, int time, Queue resultsQueue){
		this.taskNumber = taskNumber;
		this.time = time;
		this.resultsQueue = resultsQueue;
	}
	
	
	@Override
	public void run() {
		try{	
			Thread.sleep(time);
		}catch (InterruptedException ex){
			//Nothing to do?
		}	
		this.resultsQueue.add(this.taskNumber);
	}

}
