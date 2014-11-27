
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
	
	@Override
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


	public String toStringSimple(){
		String result = "["+this.value;
		
		if (this.left != null){
			result += this.left.toStringSimple();
		}
		if (this.right != null){
			result += this.right.toStringSimple();
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
		
		System.out.println();
		System.out.println("Testing node: "+this.value);//debug
		System.out.println("Testing Number: "+number);//debug

		
		if (number > this.value){
			System.out.println("1. Number > value");//debug
			if (this.right == null){
				System.out.println("2. Right is null, returning false");//debug
				return false;
			}else{
				branch = this.right;
				System.out.println("2. Assigning branch to right");//debug

			}
		}else{
			System.out.println("1. Number <= value");//debug
			if (this.left == null){
				System.out.println("2. Left is null, returning false");//debug
				return false;
			}else{
				branch = this.left;
				System.out.println("2. Assigning branch to left");//debug
			}
		}
		
		if (branch.value != number){
			System.out.println("3. Branch number not matched... moving on");//debug
			System.out.println();//debug

			return branch.remove(number);
			
		}else{
			System.out.println("3. Branch Number matches");//debug
			if (branch.left == null && branch.right == null){
				System.out.println("Branch is leaf");//debug
				if (number > this.value){
					System.out.println("4. Reassigning this.right to null");//debug
					this.right = null;
					return true;
				}else{
					System.out.println("4. Reassigning this.left to null");//debug
					this.left = null;
					return true;
				}
			}else if (branch.left != null && branch.right != null){
				IntTreeNode newBranch = branch.findSmallest();
				newBranch.left = branch.left;
				newBranch.right = branch.right;
				if (this.right == branch){
					this.right = newBranch;
				}else{
					this.left = newBranch;
				}
			return true;
			}else if (branch.left != null){
				this.left = branch.left;
				return true;
			}else{
				this.right = branch.right;
				return true;
			}
			
				
			/*}else if (branch.left != null){
				System.out.println("3. Branch left is not null");//debug				
				branch.value = branch.left.getMax();
				System.out.println("4. Reassigning this.left to "+branch.value);//debug
				return branch.remove(branch.value);
			}else{
				System.out.println("3. Branch right is not null");//debug
				branch.value = branch.right.getMin();
				System.out.println("4. Branch value set to "+branch.value);//debug
				return branch.remove(branch.value);
			}*/
		}	
	}
	
	public IntTreeNode findSmallest(){
		if (this.left == null){
			return this;
		}else{
			return this.left.findSmallest();
		}
	}
}	
