
public class GuitarTest {

	public static void main(String[] args) {
		GuitarTest test = new GuitarTest();
		test.launch();
	}
	
	public void launch(){
		Guitar guitar = new Guitar();
	
		guitar.play();
		guitar.burn();
	}
}
