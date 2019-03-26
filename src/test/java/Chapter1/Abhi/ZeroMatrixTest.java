package Chapter1.Abhi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ZeroMatrixTest {

    private ZeroMatrix zeroMatrix;

    private int[][] input;

    private int[][] expected;

    static int[][] a = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 6, 3},
    };

    static int[][] b = {
            {1, 0, 3},
            {0, 0, 0},
            {7, 0, 3},
    };

    public ZeroMatrixTest(int[][] input, int[][] expected){
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {a,b}
        });
    }

    @Before
    public void init(){
        this.zeroMatrix = new ZeroMatrix();
    }

    @Test
    public void modifyMatrix(){
        int[][] result = zeroMatrix.modifyMatrixWithZero(input);
        Assert.assertEquals(result,expected);
    }

}
