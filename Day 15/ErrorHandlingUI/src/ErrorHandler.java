import java.util.Scanner;


public class ErrorHandler {

	
	
	public static void main(String[] args) {
		
		System.out.println(readNumbers(readTimes("Enter # of numbers")));

		
	}
	
	public static double readNumbers(int number){
		Scanner sc = new Scanner(System.in);
		int total = 0;
		double result;
		boolean entered;
				
		for (int i = 0; i < number ; i++){
			entered = false;
			System.out.println("Enter a number");
			
			while (!entered){
				try{
					total += sc.nextInt();
					entered = true;
					System.out.println();

				}catch (NumberFormatException ex){
					System.out.println("That is not a number");
				}

			}
		}
		
		sc.close();
		result = total/number;
		return result;
	}
	
	public static int readTimes(String display){
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
		scan.close();
		return result;
	}

}
