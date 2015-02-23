
public class Driver {

	public static void main(String[] args) {

		System.out.println("Starting");
		
		FibonacciNormal fn = new FibonacciNormal();
		FibonnaciMemoised fm = new FibonnaciMemoised();

		long startTime = System.nanoTime();
		System.out.println(fn.fibonacci(45));
		long endTime = System.nanoTime();		
		System.out.println(endTime-startTime);
		
		startTime = System.nanoTime();
		System.out.println(fm.fibonacci(45));
		endTime = System.nanoTime();		
		System.out.println(endTime-startTime);

	}

}
