public class Marks {

	public static int students;
	public static int distinctions;
	public static int passes;
	public static int fails;
	public static int invalids;
	
	public int mark;
	
	
	
	public Marks(String entry){
		
		int number = Integer.parseInt(entry);
		System.out.println(entry);
		
		
		if (number > 100 || number < -1){
			invalids ++;
		} else{
			students ++;
			
			if (number >= 70){
				distinctions ++;
			}else if (number >= 50){
				passes ++;
			}else if (number >= 0){
				fails ++;
			}			
		}
		this.mark = number;
		System.out.println(number);
	}
	
	
	public static void main(String[] args) {

		Marks mark;
		String entry;
		
		do{

			entry = System.console().readLine();
			mark = new Marks(entry);
		}while(mark.mark != -1);
		
		System.out.println("Students:	" + Marks.students);
		System.out.println("Distinctions:	" + Marks.distinctions);
		System.out.println("Passes:		" + Marks.passes);
		System.out.println("Fails:	  	" + Marks.fails);
		System.out.println("Invalids:	" + Marks.invalids);
	}

}
