import java.util.List;
import java.util.ArrayList;



public class PrimeDivisorListImpl implements PrimeDivisorList {

	List<Integer> list;
	
	public PrimeDivisorListImpl(){
		this.list = new ArrayList<Integer>();
	}
	
	@Override
	public void add(Integer prime) {

		if (!isPrime(prime)){
			throw new IllegalArgumentException();
		}else{
			list.add(prime);
		}
	}
	
	@Override
	public int size(){
		return -1;
	}
	
	private boolean isPrime(int number){
		if (number == 2) return true;
		else{
			for (int i = 2; i <= number/2; i++){
				if (number % i == 0){
					return false;
				}
			}
			return true;
		}
	}

}
