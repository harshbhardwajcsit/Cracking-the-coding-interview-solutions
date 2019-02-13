package Chapter1.Harsh.P2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class isPermutationTest {

    isPermutation isPermutation;
    private String input1;
    private String input2;
    private boolean expected;

    public isPermutationTest(String input1, String input2, boolean expected) {
        super();
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
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
        isPermutation = new isPermutation();
    }

    @Test
    public void isPermutationOfString() throws Exception {
        boolean result = isPermutation.isPermutationOfString(input1, input2);
        Assert.assertEquals(expected, result);
    }
}
