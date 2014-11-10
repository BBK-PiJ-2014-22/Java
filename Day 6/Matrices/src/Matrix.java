
public class Matrix {

	int[][] array;
	
	public Matrix(int x, int y){
		array = new int[x][y];
		System.out.println("Array made");//debug
		for (int i = 0; i < x ; i++){
			System.out.println("Starting x:"+ i);
			for (int j = 0; j < y ; j++){
				array[x][y] = 1;
				;
			}
		}
	}
	
	public String toString(){
		String result = "";
		
		for (int i = 0; i < this.array.length ; i++){
			for (int j = 0; j < this.array.length ; j++){
				result = result + this.array[i] +", ";
			}
			result = result + "; ";
		}
		
		return result;
		
	}
	
	
	
	
}
