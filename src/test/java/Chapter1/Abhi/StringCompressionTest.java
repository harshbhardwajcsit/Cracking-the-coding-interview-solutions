package Chapter1.Abhi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringCompressionTest {

    private StringCompression stringCompression;

    private String input;

    private String expected;

    public StringCompressionTest(String input,String expected){
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"aabbcccccaaa","a2b2c5a3"},
                {"teliotel","teliotel"},
                {"", ""}
        });
    }

    @Before
    public void init() {
        stringCompression = new StringCompression();
    }

    @Test
    public void checkStringCompression(){
        String result = stringCompression.performCompression(input);
        Assert.assertEquals(result,expected);
    }
}
