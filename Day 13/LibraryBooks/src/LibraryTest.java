import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class LibraryTest {

	Library test;
	
	@Before
	public void buildUp(){
		test = new Library("Library");
	}
	
	@Test
	public void newLibraryName(){
	
		assertEquals("Library", test.getName());
	}

	@Test
	public void TestMax(){
		int max = 3;
		test.setMax(max);
		assertEquals(max, test.getMax());
	}
	
	@Test
	public void getFirstID(){
		assertEquals(1, test.getID());
	}

	
}
