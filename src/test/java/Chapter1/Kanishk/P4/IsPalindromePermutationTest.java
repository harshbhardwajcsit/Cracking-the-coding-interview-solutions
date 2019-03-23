package Chapter1.Kanishk.P4;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.Assert;

@RunWith(Parameterized.class)
public class IsPalindromePermutationTest {

	private String input;
	private boolean expected;

	private IsPalindromePermutation isPalindromePermutation;


	public IsPalindromePermutationTest(String input,boolean expected) {
		this.input=input;
		this.expected=expected;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{"catcat",true},
			{"catoact",true},
			{"teliotel",false},
			{"suruuy",false}
		});
	}

	@Before
	public void init() {
		isPalindromePermutation = new IsPalindromePermutation();
	}

	@Test
	public void palindromepermutationtest() {
		boolean result = isPalindromePermutation.checkIsPalindromePermute(input);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void palindromepermutationAlphabettest() {
		boolean result = isPalindromePermutation.checkIsPalindromeAlphabets(input);
		Assert.assertEquals(result, expected);
	}






}
