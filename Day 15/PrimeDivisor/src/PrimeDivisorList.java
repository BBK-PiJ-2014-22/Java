
public interface PrimeDivisorList {
	
	/**Adds a prime number to the list of divisors
	 * 
	 * @param prime number to add to the list
	 * 
	 * @throws NullPointerException if a null number is added to the list
	 * @throws IllegalArgumentException if a non-prime number is added to the list
	 * 
	 */
	void add(Integer prime);
	/**
	 * Returns the size of the list
	 * 
	 * @return the size of the list
	 */
	int size();
	

}
