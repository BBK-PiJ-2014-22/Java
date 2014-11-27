
public class IntSetTreeTest {

	public static void main(String[] args) {
		IntSetTree tree = new IntSetTree();
		
		tree.add(6);
		tree.add(6);
		tree.add(7);
		tree.add(7);
		tree.add(5);
		tree.add(20);
		tree.add(10);
		tree.add(19);
		tree.add(60);
		System.out.println("Contains 6: "+tree.containsVerbose(6));
		System.out.println("Contains 7: "+tree.containsVerbose(7));
		System.out.println("Contains 19: "+tree.containsVerbose(19));
		System.out.println(tree);
	}

}
