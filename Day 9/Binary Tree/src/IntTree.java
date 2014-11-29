

public class IntTree {

	public IntTreeNode head;
	
	public void add(int value){
		if (head == null){
			head = new IntTreeNode(value);
		}else{
			head.add(value);
		}
	}
	
	public boolean contains(int value){
		if (head == null) return false;
		else return head.contains(value);
	}
	
	public int depth(){
		if (head == null) return 0;
		else return head.depth();
	}
	
	public int getMax(){
		if (head == null) return 0;
		else return head.getMax();
	}
	
	public int getMin(){
		if (head == null) return 0;
		else return head.getMin();
	}
	

	public boolean remove(int number){
		if (head == null){
			return false;
			
		}else if (head.value == number){
			if (head.left == null && head.right == null){
				head = null;
			}else if (head.left != null && head.right != null){
				IntTreeNode newHead = head.right.findSmallest();
				head.parent = new IntTreeNode(head.value-1);
				head.remove(number);
				head = newHead;
			}else if (head.right != null){
				head = head.right;
				head.parent = null;
			}else{
				head = head.left;
				head.parent = null;
			}
			return true;
		}else{
			return head.remove(number);
		}	
	}

	public String toString(){
		if (head == null) return "null";
		else return head.toString();
	}

	public String toStringComplex(){
		if (head == null) return "null";
		else return head.toString();
	}

	
	





}

	
