package Chapter1.Abhi;

import Chapter1.Abhi.A1.IsUnique;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IsUniqueTest {
    IsUnique isUnique;
    private String input;
    private boolean expected;

    public IsUniqueTest(String input, boolean expected) {
        super();
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"abcd", true},
                {"AbAc", false},
                {"abecE@12", true},
                {"abcde#121", false},
                {"  ab", false},
                {"ZabcY", true},
                {"", false},
                {null, false}
        });
    }

    @Before
    public void testSetup() throws Exception {
        isUnique = new IsUnique();
    }

    @Test
    public void verfiyUniqueness() throws Exception {
        boolean result = isUnique.checkIsUnique(input);
        assertEquals(expected, result);
    }
}
