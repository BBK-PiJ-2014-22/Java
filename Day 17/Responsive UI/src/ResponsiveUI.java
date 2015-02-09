import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;

public class ResponsiveUI {

	ConcurrentLinkedQueue<Integer> finished;
		
	public static void main(String[] args) {
		ResponsiveUI rui = new ResponsiveUI();
		rui.launch();
	}

	public void launch(){
		
		finished = new ConcurrentLinkedQueue();
		
		String display = "";
		
		for (int i = 0 ; i < 10 ; i++){
			System.out.println("Enter task time for task "+i);
			int taskLength = Integer.parseInt(System.console().readLine());
			Task nextTask = new Task(i, taskLength, finished);
			Thread newThread = new Thread(nextTask);
			newThread.start();
							
			while (!finished.isEmpty()){
				if (finished.peek() != null)
					display += finished.poll() + " ";	
			}
			System.out.println(display);
			display = "";
		}
	}
}
