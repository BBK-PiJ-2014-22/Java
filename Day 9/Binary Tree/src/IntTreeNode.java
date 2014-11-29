
public class IntTreeNode {

	public int value;
	public IntTreeNode left;
	public IntTreeNode right;
	public IntTreeNode parent;
	
	
	
	public IntTreeNode(int value){
		this.value = value;
		this.left = null;
		this.right = null;
		this.parent = null;
	}

	
	public IntTreeNode(int value, IntTreeNode parent){
		this.value = value;
		this.left = null;
		this.right = null;
		this.parent = parent;
	}
	
	
	
	public void add(int newNumber){

		if(newNumber > this.value){
			if (right == null){
				this.right = new IntTreeNode(newNumber, this);
			}else{
				this.right.add(newNumber);
			}
		}else{
			if (left == null){
				this.left = new IntTreeNode(newNumber,this);
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
		
		//not number
		if (this.value != number){
			if (number > value){ 
				if (this.right == null) 
					return false;
				else 
					return this.right.remove(number);
			}else{ 
				if (this.left == null) 
					return false;
				else 
					return this.left.remove(number);
			}
		}else{ 
			if (this.left == null && this.right == null){
				if (this.value > parent.value){
					parent.right = null;
				}else{
					parent.left = null;
				}
			}else if (this.right == null && this.left != null){
				if (this.value > parent.value){
					parent.right = this.left;
				}else{
					parent.left = this.left;
				}
			}else if (this.right != null && this.left == null){
				if (this.value > parent.value){
					parent.right = this.right;
				}else{
					parent.left = this.right;
				}
			}else{
				IntTreeNode delete = this;							
				IntTreeNode newNode = this.right.findSmallest();	
				
				if (delete.value > delete.parent.value){
					delete.parent.right = newNode;					
				}else {
					delete.parent.left = newNode;					
				}
				
				if (newNode.parent != delete){
					newNode.parent.left = null; 					
				}
				newNode.left = delete.left;							
				newNode.parent = delete.parent;						

				
				if (newNode.left != null) newNode.left.parent = newNode;
				
				if (!(delete.right == newNode)){
					if (newNode.right == null){
						newNode.right = delete.right;
					}else{
						IntTreeNode largest = newNode.findLargest();
						largest.right = delete.right;
						largest.right.parent = largest;
					}
				}
								
				delete.parent = null;
				delete.left = null;
				delete.right = null;
			}

			return true;
		}
		
	}
	
	
	public IntTreeNode findSmallest(){
		if (this.left == null){
			return this;
		}else{
			return this.left.findSmallest();
		}
	}
	
	public IntTreeNode findLargest(){
		if (this.right == null){
			return this;
		}else{
			return this.right.findSmallest();
		}
	}	
}	
