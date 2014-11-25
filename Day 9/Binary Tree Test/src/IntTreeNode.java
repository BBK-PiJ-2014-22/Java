
public class IntTreeNode {

	public int value;
	public IntTreeNode left;
	public IntTreeNode right;
	
	
	public IntTreeNode(){
		this.left = null;
		this.right = null;
	}
	
	public IntTreeNode(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	
	public void add(int newNumber){
		if (newNumber > this.value){
			if (right == null){
				this.right = new IntTreeNode(newNumber);
			}else{
				this.right.add(newNumber);
			}
		}else{
			if (left == null){
				this.left = new IntTreeNode(newNumber);
			}else{
				this.left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n){
		if (this.value == n){
			return true;
		}else if (n > this.value){
			if (this.right == null){
				return false;
			}else{
				return this.right.contains(n);
			}
		}else{
			if (this.left == null){
				return false;
			}else{
				return this.left.contains(n);
			}
		}
	}
	
	public int getMax(){
		if (this.right == null){
			return this.value;
		}else{
			return this.right.getMax();
		}
	}
	
	public int getMin(){
		if (this.left == null){
			return this.value;
		}else{
			return this.left.getMin();
		}
	}
	
	public String toStringComplete(){
		
		String result = "["+this.value+" ";
		
		if (this.left == null){
			result += "L[]";
		}else{
			result += "L["+this.left.toStringComplete();
		}
		
		if (this.right == null){
			result += "R[]";
		}else{
			result += "R["+this.right.toStringComplete();
		}
		
		result += "]";
		
		return result;
	}

	@Override
	public String toString(){
		String result = "["+this.value;
		
		if (this.left != null){
			result += this.left.toString();
		}
		if (this.right != null){
			result += this.right.toString();
		}
		
		result += "]";
		return result;
		
	}
	public int depth(){
		if (this.left == null && this.right == null){
			return 1;
		}else if (this.left == null){
			return this.right.depth()+1;
		}else if (this.right == null){
			return this.left.depth()+1;
		}else{
			return Integer.max(this.right.depth(), this.left.depth())+1;
		}
	}

	public boolean remove(int number){
		
		IntTreeNode branch;
		
		if (number > this.value && this.right != null){
			branch = this.right;
		}else if(this.value < number && this.left != null){
			branch = this.left;
		}else {
			branch = this;
		}
	
		if (branch.value == number){
			if (branch.left != null){
				branch.value = branch.left.getMax();
				return branch.left.remove(branch.value);
			}else if (branch.right != null){
				branch.value = branch.right.getMin();
				return branch.right.remove(branch.value);
			}else{
				if (branch.value <= this.value){
					this.left = null;
					return true;
				}else{
					this.right = null;
					return true;
				}
			}
		}else if (number > branch.value ){
			if (branch.right == null){
				return false;				
			}
			else {
				return branch.right.remove(number);
			}
			
		}else{
			if (branch.left == null){
				return false;
			}else{
				return branch.left.remove(number);
			}
		}
	}
}
