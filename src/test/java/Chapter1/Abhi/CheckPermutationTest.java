package Chapter1.Abhi;

import Chapter1.Abhi.A2.CheckPermutation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckPermutationTest {

    CheckPermutation checkPermutation;
    private String input1;
    private String input2;
    private boolean expected;

    public CheckPermutationTest(String input1, String input2, boolean expected) {
        super();
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"abcd", "cdba", true},
                {"AbAc", "AAch", false},
                {"abecE@12", "ceE21ab@", true},
                {"abcde#121", "vdgg", false},
                {"  ab", "b a ", true},
                {"ZabcY", "532452", false},
                {"", "", true},
                {null, "dfgrdst", false}
        });
    }

    @Before
    public void testSetup() throws Exception {
        checkPermutation = new CheckPermutation();
    }

    @Test
    public void verfiyUniqueness() throws Exception {
        boolean result = checkPermutation.toCheckPermutation(input1, input2);
        assertEquals(expected, result);
    }

}
