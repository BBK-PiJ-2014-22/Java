import java.util.Random;


public class IntTreeNodeTest {

	public static void main(String[] args) {
				
		randomTreeTestGen();

	}
	

	
	public static void randomTreeTestGen(){
	
		IntTree tree = new IntTree();
		
		Random generator = new Random();
		
		int[] array = new int[7];
		array[0] = 4;
		array[1] = 3;
		array[2] = 10;
		array[3] = 8;
		array[4] = 7;
		array[5] = 9;
		array[6] = 12;
		
		for (int i = 0; i < 7 ; i++){
			//array[i] = generator.nextInt(100);
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
		
/*		tree.add(array[3]);
		tree.add(array[3]);*/
		testRemove(tree, 8);
		//testRemove(tree, tree.getMin());
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



