
public class MathTreeTest {

	public static void main(String[] args) {
		
		simpleParseTest("2*2", "2", "*", "2", "Simple Parse Test 1 Failed");
		simpleParseTest("12/2", "12", "*", "2", "Simple Parse Test 2 Failed");
		simpleParseTest("2+12", "2", "+", "12", "Simple Parse Test 3 Failed");
		simpleParseTest("2*2", "4", "/", "4", "Simple Parse Test 4 Failed");
		
		
		
		
	}

	
	public static void simpleParseTest(String input, String left, String operator, String right, String message){
		MathTree result = new MathTree(input);
		boolean failed = false;
		
		
		
		if (!result.left.value.equals(left)){
			failed = true;
			System.out.println("Left Failed: "+ result.left.value + "!="+left);
		}
		if (!result.right.value.equals(right)){
			failed = true;
			System.out.println("Right failed"+ result.right.value + "!="+right);
			
		}if (!(result.value == operator)){
			failed = true;
			System.out.println("Operator failed"+ result.value + "!="+operator);
		}
		if (failed){
			System.out.println(message);
			System.out.println();
		}
		
		

	
		
		
	}
	
}
