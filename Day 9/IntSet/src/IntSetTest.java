
public class IntSetTest {

	public static void main(String[] args) {
		IntSet set = new IntSetList();
		
		set.add(6);
		set.add(6);
		set.add(7);
		set.add(7);
		set.add(5);
		set.add(20);
		set.add(10);
		set.add(19);
		set.add(60);
		System.out.println("Contains 6: "+set.containsVerbose(6));
		System.out.println("Contains 7: "+set.containsVerbose(7));
		System.out.println("Contains 19: "+set.containsVerbose(19));
		System.out.println(set);
	}

}
