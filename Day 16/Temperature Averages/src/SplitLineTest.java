import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;

@RunWith(Parameterized.class)
public class SplitLineTest {

	String line;
	int average;
	int count;
	int[] tokens;
	
	@Parameters
	public static Collection<Object[]> data() {

		Object[][] arr= { {"1,2,3,4,5", 3, 5},
				          {"1, ,3,4,5",3.25,4},
				          {"1", 1,1}
		};
        return Arrays.asList(arr);
    }

	public SplitLineTest(String line, int average, int count){
		this.line = line;
		this.average = average;
		this.count = count;
	}
	
	@Test
	public void test() {
		;
	}

}
