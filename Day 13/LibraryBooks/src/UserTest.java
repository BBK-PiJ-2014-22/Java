import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class UserTest {

	User user;
	String name;
	int id;
	
	@Before
	public void buildUp(){
		name = "Jamie MacIver";
		user = new User(name);
	}
	
	@Test
	public void NormalUserName(){
		assertEquals(name, user.getName());
	}
	
	@Test
	public void SetUserID(){
		user.setLibraryID(102);
		assertEquals(102, user.getLibraryID());
	}
	
	@Test
	public void NormalUserID(){
		assertEquals(0, user.getLibraryID());
	}
	
	@Test
	public void GetRealLibrary(){
		user.registerLibrary(new Library("Stupid"));
		assertEquals("Stupid", user.getLibrary());
	}
	
	@Test
	public void GetRealID(){
		user.registerLibrary(new Library("Stupid"));
		assertEquals(1, user.getLibraryID());
	}
	
}
