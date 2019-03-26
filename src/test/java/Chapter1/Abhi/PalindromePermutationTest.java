package Chapter1.Abhi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PalindromePermutationTest {

    private PalindromePermutation palindromePermutation;

    private String input;

    private boolean expected;

    public PalindromePermutationTest(String input,boolean expected) {
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
        palindromePermutation = new PalindromePermutation();
    }

    @Test
    public void palindromepermutationtest() {
        boolean result = palindromePermutation.checkPalindromPermutation(input);
        Assert.assertEquals(result, expected);
    }


}
