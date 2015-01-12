
public class User {

	String name;
	int id;
	Library library;
	
	public User(String name){
		this.name = name;
	}

	public User(String name, int id){
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getLibraryID(){
		return this.id;
	}
	
	public void setLibraryID(int id){
		this.id = id;
	}
	
	public void registerLibrary(Library library){
		this.library = library;
		this.id = library.getID();
	}
	
	public String getLibrary(){
		return this.library.getName();
	}
	
}
