class CalculatorTest{
	public static void main(String[] args) {

	
		int num1 = 10;
		int num2 = 5;

		Calculator calc = new Calculator();
		
		System.out.print("Add: ");
		calc.add(num1, num2);
		System.out.print("Div: ");
		calc.divide(num1, num2);
		System.out.print("Sub: ");
		calc.subtract(num1, num2);
		System.out.print("Mod: ");
		calc.modulus(num1, num2);
		System.out.print("Mul: ");
		calc.multiply(num1, num2);
		

	}
}