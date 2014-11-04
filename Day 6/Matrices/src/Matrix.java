
public class Matrix {

	int[][] array;
	
	public Matrix(int x, int y){
		array = new int[x][y];
		for (int i = 0; i < x ; i++){
			for (int j = 0; j < y ; j++){
				array[x][y] = 1;
			}
		}
	}
	
	public String toString(){
		String result = "";
		
		for (int i = 0; i < this.array.length ; i++){
			for (int j = 0; j < y ; j++){
				result = result + this.array[i];
			}
		}
	}
	
	
	
}
