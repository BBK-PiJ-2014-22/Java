
public class Company {

	public static void main(String[] args){
		Company company = new Company();
		company.launch();
	}
	
	public void launch(){
		GenericList<String> names = new GenericList<String>();
		GenericList<Integer> numbers = new GenericList<Integer>();
		
		names.add("Jamie");
		names.add("David");
		names.add("Bob");
		
		System.out.println(names);
		System.out.println("");
		
		numbers.add(15);
		numbers.add(12);
		numbers.add(19);

		System.out.println(numbers);
		
	}
}
