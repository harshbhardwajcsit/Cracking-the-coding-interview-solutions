package Chapter1.Kanishk.P3;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class URIConvertTest {
	
	private String input;
	
	private String output;
	
	URIConvert uriConvert;
	
	@Parameterized.Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"abc d  ","abc%20d"},
			{"arg","arg"}
		});
	}
	
	public URIConvertTest(String input, String output) {
		this.input=input;
		this.output = output;
	}
	
	@Before
	public void init() {
		uriConvert=new URIConvert();
	}
	
	@Test
    public void uriconvertTest() throws Exception {
        String result = uriConvert.convertToUri(input);
        Assert.assertEquals(output, result);
    }

}
