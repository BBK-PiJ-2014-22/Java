import java.util.concurrent.Executor;

/**
 * This class launched two heavy computations
 * sequentially first, then in parallel. 
 * Assuming there is more than one processor in 
 * the machine, parallel computations finish
 * earlier.
 */
public class ComputationLauncher {   
    /**
     * How many numbers to process? If too low, there is no noticeable
     * difference.
     */
     public static final int COUNT = 40000000;
     public static final int TESTCOUNT = 6;

    /*
     * The computations to be performed. Stored as fields so 
     * both methods (sequential and parallel) act on exactly 
     * the same data
     */
     
    private Computation[] computations = new Computation[TESTCOUNT];
   

    /**
     * The main method that launches the computations
     *
     * @param args command-line arguments, ignored
     */
    public static void main(String args[]) {
	  ComputationLauncher c = new ComputationLauncher();
	  c.launch();
    }
   
    private double[] createArray(int size) {
	  double[] result = new double[size];
	  for (int i = 0; i < result.length; i++) 
		{
		    result[i] = Math.random();
		}
	  return result;
    }
   
    private void launch() {
	  // Uncomment the following line to know how many processors your machine has
	  // System.out.println("#CPU: " + Runtime.getRuntime().availableProcessors());
	  long start, stop;
	  
	  for (int i = 0; i < TESTCOUNT ; i++)
		  computations[i] = new Computation(createArray(COUNT/2));


	  start = System.currentTimeMillis();
	  executor(6);
	  stop = System.currentTimeMillis();
	  System.out.println("Time with executor (6): " + (stop - start) + "ms");
	  
	  start = System.currentTimeMillis();
	  executor(4);
	  stop = System.currentTimeMillis();
	  System.out.println("Time with executor (4): " + (stop - start) + "ms");
	  
	  start = System.currentTimeMillis();
	  executor(2);
	  stop = System.currentTimeMillis();
	  System.out.println("Time with executor (2): " + (stop - start) + "ms");
	  
	  start = System.currentTimeMillis();
	  parallelComputations();
	  stop = System.currentTimeMillis();
	  System.out.println("Time with threads: " + (stop - start) + "ms");
  
	  start = System.currentTimeMillis();
	  sequentialComputations();
	  stop = System.currentTimeMillis();
	  System.out.println("Time without threads: " + (stop - start) + "ms");

    }
        
    private void executor(int threadLimit) {
    	Executor e = new ExecutorImpl(threadLimit);
    	
    	for (int i = 0 ; i < TESTCOUNT ; i++)
    		e.execute(computations[i]);
    	
    	double result = 0.0;  	
    	for (int i = 0 ; i < TESTCOUNT ; i++)
    		result += computations[i].getResult();		
    	System.out.println("Result: " + (result));
     }
    
    private void sequentialComputations() {
    	double result = 0.0;
    	
    	for (int i = 0 ; i < TESTCOUNT ; i++)
    		computations[i].run();
    	
    	
    	for (int i = 0 ; i < TESTCOUNT ; i++)
    		result += computations[i].getResult();
    	System.out.println("Result: " + (result));
    	
    	
      }
     
      private void parallelComputations() {
      	for (int i = 0 ; i < TESTCOUNT ; i++){
    		Thread t = new Thread(computations[i]);
    		t.start();
      	}
    	
    	double result = 0.0;  	
    	for (int i = 0 ; i < TESTCOUNT ; i++)
    		result += computations[i].getResult();		
    	System.out.println("Result: " + (result));
     }
}
