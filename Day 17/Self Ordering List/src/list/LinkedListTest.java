package list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	
	LinkedList list;

	@Before
	public void setUp() throws Exception {
		this.list = new LinkedList();
		for (int i = 0 ; i < 5 ; i++)
			list.add(i);
	}

	@Test
	public void testBasicListHead() {
		assertEquals(0,list.get(0));
	}

	@Test
	public void testBasicListMiddle() {
		assertEquals(4,list.get(4));
	}
	
	@Test
	public void testBasicListOutOfBounds(){
		assertEquals(null,list.get(6));
	}
	

}
