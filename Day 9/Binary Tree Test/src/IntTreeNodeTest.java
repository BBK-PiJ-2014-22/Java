
public class IntTreeNodeTest {

	public static void main(String[] args) {
				
		IntTreeNode tree = new IntTreeNode(5);
		
		int[] array = new int[20];
		
		for (int i = 0; i < 20 ; i++){
			array[i] = (int)(Math.random()*100);
			tree.add(array[i]);

		
		}
	}
}


