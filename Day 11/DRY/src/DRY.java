
public class DRY {

	public static void main(String[] args){
		DRY dry = new DRY();
		dry.launch();
	}
	
	public void launch(){
		
		Comparator comp = new Comparator();
	
		int inttest1 = 1;
		int inttest2 = 2;
		double doutest1 = 1.0;
		double doutest2 = 2.0;
		String strtest1 = "1";
		String strtest2 = "2";
		
		System.out.println(comp.getMax(inttest1, inttest2));
		System.out.println(comp.getMax(doutest1, doutest2));
		System.out.println(comp.getMax(strtest1, strtest2));	
	}
}
