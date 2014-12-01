

public class MathTree {

	
	//Find symbol of maximum scope
	//Node is assigned to maximum scope
	//Everything before symbol is String1
	//Everything after symbol is String2
	//left = string1
	//right = string2
	
	
	private String value;
	private MathTree right;
	private MathTree left;
	private boolean operator;

	
	public static MathTree parseMathTree(String formula){
		return new MathTree(formula);
	}
	
	@Override
	public String toString(){
		if (this.left == null && this.right == null){
			return this.value;
		}else{
			return "("+this.left.toString()+this.value+this.right.toString()+")";
		}
	}
	

	public String getValue() {
		return value;
	}

	public MathTree getRight() {
		return right;
	}

	public MathTree getLeft() {
		return left;
	}

	public boolean isOperator() {
		return operator;
	}

	

	public MathTree(String formula){
	
		int bracketCount = 0;
		int plusMinusPosition = 0;
		int multiplyDividePosition = 0;
		int symbolPosition;
		String token;
		
		
		//Cuts off the outermost brackets, if present.
		formula = trimBrackets(formula);
	
		//Looks through the string to establish first operators in the area of maximal scope
		//Formulas of length 1 cannot be symbols
		if (formula.length() > 1){
			for (int i = 1; i < formula.length() ; i++){
				token = formula.substring(i-1,i);
				if (token.equals("(")){
					bracketCount += 1;
				}else if(token.equals(")")){
					bracketCount -= 1;
				}else if (isOperator(token)){
					if (bracketCount == 0){
						if ((token.equals("+")|| token.equals("-")) && plusMinusPosition == 0){
							plusMinusPosition = i;
						}else if (multiplyDividePosition == 0){
							multiplyDividePosition = i;
						}
					}		
				}		
			}
		}
		
		//If a symbol has been found, appoints the left most symbol of maximum scope to the symbol position
		if (multiplyDividePosition > 0){
			symbolPosition = multiplyDividePosition;
		}else if(plusMinusPosition > 0){
			symbolPosition = plusMinusPosition;
		}else{
			symbolPosition = 0;
		}
		
		if (symbolPosition > 0){
			this.left  = new MathTree(formula.substring(0,symbolPosition-1));
			this.value = formula.substring(symbolPosition-1, symbolPosition);
			this.right = new MathTree(formula.substring(symbolPosition,formula.length()));
		}else{
			this.value = formula;
		}

	}
	
	
	
	//Is Operator
	private boolean isOperator(String token){
		if (token.equals("*") ||
			token.equals("/") ||
			token.equals("-") ||
			token.equals("+")){
			return true;
		}
		else{
			return false;
		}	
	}
	
	
	private static String trimBrackets(String str){
		if (str.charAt(0) == '('){
			return str.substring(1, str.length());
		}else{
			return str;
		}
	}
	
}
