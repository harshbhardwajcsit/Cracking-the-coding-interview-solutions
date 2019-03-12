package Chapter1.Abhi.A1;

import java.util.Arrays;

public class IsUnique {

    public boolean checkIsUnique(String str) {
        int[] intArray = new int[128];
        if (str == null || str.isEmpty() || str.length() > 128) {
            return false;
        }
        Arrays.fill(intArray,-1);
        for (int i = 0; i < str.length(); i++) {
            int charAscii = str.charAt(i);
            if (intArray[charAscii] == -1) {
                intArray[charAscii] = charAscii;
            } else {
                return false;
            }
        }
        return true;
    }
}
