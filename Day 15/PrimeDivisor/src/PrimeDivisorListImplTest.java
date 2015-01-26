import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PrimeDivisorListImplTest {

	PrimeDivisorList list;
	
	@Before
	public void setUp() throws Exception {
		PrimeDivisorList list = new PrimeDivisorListImpl();
	}

	@Test
	public void testPrimeAdd() {
		list.add(2);
		list.add(3);
		
		assertEquals(list.size(), 2);
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullInt(){
		list.add(null);
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testNonPrime(){
		list.add(4);
	}

}
