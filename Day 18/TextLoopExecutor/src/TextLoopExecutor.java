import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class TextLoopExecutor implements Runnable {
	public static final int COUNT = 10;
	private final String name;
	
	public TextLoopExecutor(String name) {
		this.name = name;
	}
		
	@Override
	public void run() {
		for (int i = 0; i < COUNT; i++) {
			System.out.println("Loop:" + name + ", iteration:" + i + ".");
		}
	}

		
	public static void main(String args[]) {
		
		BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(50);
		
		Executor ent = new ThreadPoolExecutor(1,1, Long.MAX_VALUE, TimeUnit.NANOSECONDS, queue);
		Executor et = new ThreadPoolExecutor(4,20, Long.MAX_VALUE, TimeUnit.NANOSECONDS, queue);
		
		if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
			System.out.println("USAGE: java TextLoop <mode>");
			System.out.println(" mode 0: without threads");
			System.out.println(" mode 1: with threads");
		} else if (args[0].equals("0")) {
			for (int i = 0; i < 10; i++) {
				ent.execute(new TextLoopExecutor("Thread " + i));
			}
		} else {
			for (int i = 0; i < 10; i++) {
				et.execute(new TextLoopExecutor("Thread " + i));
			}
		}	
	}
}
