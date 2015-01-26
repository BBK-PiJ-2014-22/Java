import java.util.Scanner;


public class ErrorHandler {

	
	public static void main(String[] args) {
		
		System.out.println(readNumbers(readInt("Enter # of numbers")));

	}
	
	public static double readNumbers(int number){
		double total = 0;
		double result;
				
		for (int i = 0; i < number ; i++){
			total += readInt("Enter Number");
		}
		
		result = total/number;
		return result;
	}
	
	public static int readInt(String display){
		Scanner scan = new Scanner(System.in);
		int result = 0;
		boolean entered = false;

		while(!entered){
			try{
				System.out.println(display);
				result = scan.nextInt();
				entered = true;
			}catch (NumberFormatException ex){
				System.out.println("That is not a number");
			}
		}
		return result;
	}
}
