
public class IntSetTreeTest {

	public static void main(String[] args) {
		IntSetTreeNode head = new IntSetTreeNode(5);
		
		head.add(6);
		head.add(7);
		System.out.println("Contains 6: "+head.contains(6));
		System.out.println("Contains 7: "+head.contains(7));
		System.out.println("Contains 8: "+head.contains(8));
		System.out.println(head);
	}

}
