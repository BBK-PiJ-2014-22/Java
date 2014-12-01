
public class MathTreeTest {

	public static void main(String[] args) {
		
		
		MathTree test = new MathTree(("2*(2+2*2))+2*2"));
		System.out.println(test);
		
		
		simpleParseTest("2*2", "2", "*", "2", "Simple Parse Test 1 Failed");
		simpleParseTest("12*2", "12", "*", "2", "Simple Parse Test 2 Failed");
		simpleParseTest("2+12", "2", "+", "12", "Simple Parse Test 3 Failed");
		simpleParseTest("4/4", "4", "/", "4", "Simple Parse Test 4 Failed");
		
		
		
		
	}

	
	public static void simpleParseTest(String input, String left, String operator, String right, String message){
		MathTree result = new MathTree(input);
		boolean failed = false;
		
		if (!result.getLeft().toString().equals(left)){
			failed = true;
			System.out.println("Left Failed: "+ result.getLeft().toString() + "!="+left);
		}
		if (!result.getRight().toString().equals(right)){
			failed = true;
			System.out.println("Right failed: "+ result.getRight().toString() + "!="+right);
			
		}if (!(result.getValue().equals(operator))){
			failed = true;
			System.out.println("Operator failed: "+ result.getValue() + "!="+operator);
		}
		if (failed){
			System.out.println(message);
			System.out.println();
		}
		
		

	
		
		
	}
	
}
