package Chapter1.Kanishk.P1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CharacterUniquenessTest {
    Chapter1.Kanishk.P1.CharacterUniqueness characterUniqueness;
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
                {"abecE@12", true},
                {"abcde#121", false},
                {"  ab", false},
                {"ZabcY", true},
                {"",true}
        });
    }

    @Before
    public void testSetup() throws Exception {
        characterUniqueness = new Chapter1.Kanishk.P1.CharacterUniqueness();
    }

    @Test
    public void findIsStringHasUniqueCharacter() throws Exception {
        boolean result = characterUniqueness.isUnique(input);
        assertEquals(expected, result);
    }
}
