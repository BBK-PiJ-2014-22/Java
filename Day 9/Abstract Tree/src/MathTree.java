

public class MathTree {

	
	//Find symbol of maximum scope
	//Node is assigned to maximum scope
	//Everything before symbol is String1
	//Everything after symbol is String2
	//left = string1
	//right = string2
	
	
	public String value;
	public MathTree right;
	public MathTree left;
	public boolean operator;

	
	
	

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
		String token;
		
	
		for (int i = 1; i < formula.length() ; i++){
			token = formula.substring(i-1,i);
			if (token == "("){
				bracketCount += 1;
			}else if(token == ")"){
				bracketCount -= 1;
			}else if (isOperator(token)){
				if (bracketCount == 0){
					if ((token == "+" || token == "-") && plusMinusPosition == 0){
						plusMinusPosition = i;
					}else if (multiplyDividePosition == 0){
						multiplyDividePosition = i;
					}
				}		
			}		
		}
		
		
		
		
	}
	
	
	
	//Is Operator
	private boolean isOperator(String token){
		if (token == "*" ||
			token == "/" ||
			token == "-" ||
			token == "+"){
			return true;
		}
		else{
			return false;
		}	
	}
	
	
	
	
}
