
public class FibonnaciMemoised {

	int[] array = null;
	
	public int fibonacci(int number){
		if (array == null)
			createArray(number);
		if(number == 1 || number == 2)
			return 1;
		else if (array[number-1] != -1){
			return array[number-1];
		}
		else{
			int result = this.fibonacci(number-1)+this.fibonacci(number-2);
			array[number-1] = result;
			return result;
		}
	}
	
	public void createArray(int size){
		System.out.println("Created");
		array = new int[size];
		for (int i = 0 ; i < size ; i++)
			array[i] = -1;
	}
	
}
