
public class ArrayCopierTest {
	
	public static int[] build(){
		int length = (int) (Math.random()*10) + 4;
		int[] result;
		result = new int[length];
		
		for (int i = 0; i < length ; i++){
			result[i] = (int)(Math.random()*10);
		}
		
		return result;
	}
	
	public static void display(int[] array){
		String result = "";
		for (int i = 0; i < array.length ; i++){
			result = result + " " + array[i];
		}
		System.out.println(result);
	}
	
	
		
	public static void main(String[] args) {
			
		int[] src; 
		int[] dst;

		
		
		for (int i = 0 ; i < 6 ; i++){
			
		src = build();
		dst = build();
			
		display(src);
		display(dst);
		System.out.println("Copies to:");
	
		ArrayCopier.copyArray(src, dst);
		
		display(dst);
		System.out.println();
				
		}
		
	}

}
