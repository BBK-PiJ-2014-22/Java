import static org.junit.Assert.*;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class PersonTest {

	private String input;
	private String expected;
	
	public PersonTest(String input, String expected){
		this.input = input;
		this.expected = expected;
	}
	
	@Parameters
	public static Collection<Object[]> process(){
		
	}
	
	
	@Test
	public void test() {
	}

}
