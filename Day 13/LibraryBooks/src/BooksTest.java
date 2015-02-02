import static org.junit.Assert.*;

import org.junit.Test;


public class BooksTest {
	
	
	@Test
	public void testNormalBookName(){
		
		String author = "Robert Jordan";
		String title = "Eye of the World";
		Book book = new BookImpl(author, title);
		assertEquals(author, book.getAuthor());
	}
	
	@Test
	public void testNormalBookTitle(){
		
		String author = "Robert Jordan";
		String title = "Eye of the World";
		Book book = new BookImpl(author, title);
		assertEquals(title, book.getTitle());
	}

	@Test
	public void testNormalBookTitleNull(){
		
		String author = "Robert Jordan";
		String title = null;
		Book book = new BookImpl(author, title);
		assertEquals(title, book.getTitle());
	}
	
	@Test
	public void testNormalBookAuthorNull(){
		
		String author = null;
		String title = "Eye of the World";
		Book book = new BookImpl(author, title);
		assertEquals(author, book.getAuthor());
	}
	
}
