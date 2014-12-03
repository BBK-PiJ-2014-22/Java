
public class Ark {
	
	Animal[] onBoard;
	int animalsOnBoard;
	
	public Ark(){
		onBoard = new Animal[40];
		animalsOnBoard = 0;
	}
	
	public boolean add(Animal animal){
		if (animalsOnBoard < onBoard.length){
			onBoard[animalsOnBoard] = animal;
			animalsOnBoard += 1;
			return true;
		}
		System.out.println("The ark is full.");
		return false;
	
	}
	
}
