
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
		
			if(head.left == null && head.right == null){
				head = null;
			}else if (head.left != null){
				head.value = head.left.getMax();
				head.remove(head.value);
			}else if (head.right != null){
				head.value = head.right.getMin();
				head.remove(head.value);

			}else{
				System.out.println("Error in IntTree checker");
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

	public String toStringSimple(){
		if (head == null) return "null";
		else return head.toStringSimple();
	}

	
	





}

	
