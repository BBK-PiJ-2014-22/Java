package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;

import tr.TR;

@RunWith(Parameterized.class)
public class TRTest {
	
	String original;
	String toReplace;
	String replaceWith;
	String newString;
	String result;
	TR tr;
	
	
	@Parameters
	public static Collection<String[]> data() {

		String[][] arr= { {"This is a test", "is", "foo", "Thfoo foo a test"},
				          {"This is a test", "fo", "fee", "This is a test"},
				          {"This is a test", "This", "foo", "foo is a test"},
				          {"This fofofo a test", "fo", "ifo", "This ifoifoifo a test"},
				          {"This is a test", "is", "foo", "Thfoo foo a test"},
				          {"oooo", "o", "oo", "oooooooo"}
		};
        return Arrays.asList(arr);
    }
	public TRTest(String original, String toReplace, String replaceWith, String newString){
		this.original = original;
		this.toReplace = toReplace;
		this.replaceWith = replaceWith;
		this.newString = newString;
	}
	
	@Before
	public void buildUp(){
		tr = new TR();
		result = null;
	}
	
	
	@Test
	public void removeStringTest() {
		result = tr.removeString(original, toReplace, replaceWith);
		assertEquals(this.newString,result);
		
	}

}
