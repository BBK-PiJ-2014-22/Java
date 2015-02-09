import java.util.Queue;


public class ResponsiveUI {

	int taskLength;
	Queue<Integer> finished;
	
	
	
	public static void main(String[] args) {
		ResponsiveUI rui = new ResponsiveUI();
		rui.launch();
	}

	public void launch(){
		for (int i = 0 ; i < 10 ; i++){
			taskLength = Integer.parseInt(System.console().readLine());
			
		}
	}
	
}
