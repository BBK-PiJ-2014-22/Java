
public class IntSetTreeNode {

	int value;
	IntSetTreeNode left;
	IntSetTreeNode right;
	
	public IntSetTreeNode(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public void add(int number){
		if (!this.contains(number)){
			
			if (number <= this.value){
				if (this.left == null){
					this.left = new IntSetTreeNode(number);
				}else{
					this.left.add(number);
				}	
			}else{
				if (this.right == null){
					this.right = new IntSetTreeNode(number);
				}else{
					this.right.add(number);
				}	
			}		
		}
	}
	
	public boolean contains(int number){
		if (this.value == number){
			return true;
		}else{
			IntSetTreeNode branch;
			if (number <= this.value){
				branch = this.left;
			}else{
				branch = this.right;
			}
			if (branch == null){
				return false;
			}
			else{
				return branch.contains(number);
			}
		}
	}
	
	public boolean containsVerbose(int number){
	
		System.out.println("Comparing v"+this.value+"to n"+number);
	
		if (this.value == number){
			return true;
		}else{
			IntSetTreeNode branch;
			if (number <= this.value){
				branch = this.left;
			}else{
				branch = this.right;
			}
			if (branch == null){
				return false;
			}
			else{
				return branch.containsVerbose(number);
			}
		}
	}
	
	
	
	public String toString(){
		
		String result = "["+this.value+" ";
		
		if (this.left == null){
			result += "L[]";
		}else{
			result += "L["+this.left.toString();
		}
		if (this.right == null){
			result += "R[]";
		}else{
			result += "R["+this.right.toString();
		}
		result += "]";
		return result;
	}	
}


