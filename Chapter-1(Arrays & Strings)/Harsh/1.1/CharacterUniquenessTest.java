import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CharacterUniquenessTest {
    CharacterUniqueness characterUniqueness;
    private String input;
    private boolean expected;

    public CharacterUniquenessTest(String input, boolean expected) {
        super();
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"abcd", true},
                {"AbAc", false},
                {"abecE@12", false},
                {"abcde#121", true},
                {"  ab", true},
                {"ZabcY", true},
                {"",false},
                {null,false}
        });
    }

    @Before
    public void testSetup() throws Exception {
        characterUniqueness = new CharacterUniqueness();
    }

    @Test
    public void findIsStringHasUniqueCharacter() throws Exception {
        boolean result = characterUniqueness.checkUnique(input);
        assertEquals(expected, result);
    }
}