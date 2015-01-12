
public class Library {

	/***Create a class Library for the library. Libraries have a name, set at construction time. They also have a “maximum
number of books borrowed by the same person” policy (e.g. max three books per user), which can be updated at
any time. Of course, they also have a method to get the maximum number of books to be borrowed at any time
(e.g. getMaxBooksPerUser())**/
	
	private String name;
	private int maxBooks;
	
	public Library(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setMax(int max){
		this.maxBooks = max;
	}
	
	public int getMax(){
		return this.maxBooks;
	}
	
	public int getID(){
		return 2;
	}
	
	
	
}
