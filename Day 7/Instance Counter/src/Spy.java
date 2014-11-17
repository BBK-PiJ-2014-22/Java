
public class Spy {

	public static int spyCount;
	int id;
	
	public Spy(int id){
		spyCount ++;
		this.id = id;
		System.out.println("Spy: "+ this.id + " has been added.");
		System.out.println("There are " + spyCount + " spies.");
	}
	
	public void die(){
		spyCount --;
		System.out.println("Spy: " + this.id + "has died! RIP.");
		System.out.println("There are " + spyCount + " spies.");
	}

	public static void main(String[] args){
		
		Spy spy1 = new Spy((int)(Math.random()*1000));
		Spy spy2 = new Spy((int)(Math.random()*1000));
		Spy spy3 = new Spy((int)(Math.random()*1000));
		Spy spy4 = new Spy((int)(Math.random()*1000));
		Spy spy5 = new Spy((int)(Math.random()*1000));
		Spy spy6 = new Spy((int)(Math.random()*1000));
		Spy spy7 = new Spy((int)(Math.random()*1000));
		Spy spy8 = new Spy((int)(Math.random()*1000));
		Spy spy9 = new Spy((int)(Math.random()*1000));
		
		spy5.die();
		spy4.die();
		spy3.die();
		spy2.die();
		spy1.die();	
			
		}		
}

	



