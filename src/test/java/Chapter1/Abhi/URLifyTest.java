package Chapter1.Abhi;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class URLifyTest {

    URLify urLify;
    private String input;
    private String expected;

    public URLifyTest(String input1, String expected) {
        super();
        this.input = input1;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"ab cd", "ab%20cd"},
                /*{"AbAc", "AAch", false},
                {"abecE@12", "ceE21ab@", true},
                {"abcde#121", "vdgg", false},
                {"  ab", "b a ", true},
                {"ZabcY", "532452", false},
                {"", "", true},
                {null, "dfgrdst", false}*/
        });
    }

    @Before
    public void testSetup() throws Exception {
        urLify = new URLify();
    }

    @Test
    public void urilifying() throws Exception {
        String result = urLify.toURLify(input);
        assertEquals(expected, result);
    }

}
