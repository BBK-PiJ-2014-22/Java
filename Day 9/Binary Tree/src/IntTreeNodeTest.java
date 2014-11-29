import java.util.Random;


public class IntTreeNodeTest {

	public static void main(String[] args) {
				
		randomTreeTestGen();

	}
	

	
	public static void randomTreeTestGen(){
	
		IntTree tree = new IntTree();
		
		Random generator = new Random();
		
		int[] array = new int[20];
		/*array[0] = 4;
		array[1] = 3;
		array[2] = 13;
		array[3] = 14;
		array[4] = 8;
		array[5] = 7;
		array[6] = 11;
		array[7] = 9;
		array[8] = 10;
		array[9] = 12;*/
	
		
		
				
		
		for (int i = 0; i < 20 ; i++){
			array[i] = generator.nextInt(100);
			tree.add(array[i]);
		}
		
		
		
		
		
		System.out.println(stringArray(array));
		System.out.println();
		
/*		System.out.println("Contains "+array[4] + ": "+tree.contains(array[4]));
		System.out.println("Contains 101 :"+tree.contains(101));
		System.out.println("Max: "+tree.getMax());
		System.out.println("Min: "+tree.getMin());
		System.out.println(tree.toStringComplete());
		System.out.println(tree);
		System.out.println(tree.depth());
*/
		testRemove(tree, 8);
		testRemove(tree, tree.getMin());
		testRemove(tree, tree.getMax());
		testRemove(tree, array[0]);
		testRemove(tree, array[15]);
	}

	public static void testRemove(IntTree tree , int number){
		System.out.println(tree);
		System.out.println("Removing "+ number);
		System.out.println(tree.remove(number));
		System.out.println(tree);
		System.out.println();

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



