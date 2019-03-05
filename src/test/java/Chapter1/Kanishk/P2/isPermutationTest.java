package Chapter1.Kanishk.P2;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class isPermutationTest {
	
	
	private String input1;
	
	private String input2;
	
	private boolean expected;
	
	private IsStringPermutation isStringPermutation;
	
	public isPermutationTest(String input1, String input2, boolean result) {
		this.input1=input1;
		this.input2=input2;
		this.expected=result;
	}

	@Parameterized.Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][]{
	                {"abcd", "bcad", true},
	                {"AbAc", "AaAc", false},
	                {"", "abc", false},
	                {"abc", "abcd", false},
	                {"abAcdef1aA", "bacAAed1fa", true},
	                {null,"abc",false},

	        });
	    }
	    
	    @Before
	    public void testSetup() throws Exception {
	        isStringPermutation = new IsStringPermutation();
	    }

	    @Test
	    public void isPermutationOfString() throws Exception {
	        boolean result = isStringPermutation.isPermutationOfString(input1, input2);
	        Assert.assertEquals(expected, result);
	    }
}
