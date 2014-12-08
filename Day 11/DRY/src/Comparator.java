public class Comparator {

	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}
	
	public int getMax(int n, int m) {
		double result = getMax((double) n, (double) m);
		return (int)result; 
	}


	public String getMax(String number1, String number2) {
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
	
		int result = getMax(n1,n2);
		
		if (result == n1){
			return number1;
		}else{
			return number2;
		}
	}
}