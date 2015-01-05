import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;


public class HashTest {

	private int number;
	private int hash;
	private Random rand = new Random();
	
	@Test
	public void test() {
		for (int i = 0 ; i < 10000 ; i++){
			number = rand.nextInt();
			hash = HashUtilities.shortHash(number);
			assertTrue(number+":"+hash+" of of range", hash >= 0 && hash <= 1000);
		}
	}
	
	@Test
	public void willFail(){
		number = rand.nextInt();
		hash = 1001;
		assertTrue(number+":"+hash+" of of range",  hash >= 0 && hash <= 1000);	
	}
}
