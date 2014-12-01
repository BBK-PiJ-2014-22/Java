package calllist;

public interface CallList {

	/**Adds a number to the CallList*/
	void add(String number);
	
	/**Returns last number dialled*/
	String lastDialled();
	
	/**Prints the full list of dialled numbers*/
	void printList();
		
}
