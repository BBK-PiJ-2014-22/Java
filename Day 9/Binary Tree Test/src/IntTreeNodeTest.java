import java.util.Random;


public class IntTreeNodeTest {

	public static void main(String[] args) {
				
		IntTreeNode tree = new IntTreeNode(5);
		Random generator = new Random();
		
		int[] array = new int[5];
		
		for (int i = 0; i < 5 ; i++){
			array[i] = generator.nextInt(100);
			tree.add(array[i]);
		}
		
		System.out.println(stringArray(array));
		System.out.println();
		
		System.out.println("Contains "+array[4] + ": "+tree.contains(array[4]));
		System.out.println("Contains 101 :"+tree.contains(101));
		System.out.println("Max: "+tree.getMax());
		System.out.println("Min: "+tree.getMin());
		System.out.println(tree.toStringComplete());
	}

	public static String stringArray(int[] array){
		String result = "[";
		for (int i = 0; i < array.length ; i++){
			result = result + array[i] + ", ";
		}
		result = result +"]";
		return result;
	}
	
}


