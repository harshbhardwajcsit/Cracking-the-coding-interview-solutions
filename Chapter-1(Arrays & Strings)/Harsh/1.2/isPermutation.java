import java.util.HashMap;
import java.util.Map;

public class isPermutation {
    boolean isPermutationOfString(String s1, String s2) {

        if (s1 == null || s2 == null)
            return Boolean.FALSE;

        if (s1.length() == 0 || s2.length() == 0)
            return Boolean.FALSE;

        if (s1.length() != s2.length())
            return Boolean.FALSE;

        final Map<Character, Integer> characterIntegerMap = new HashMap<>();
        char chars[] = s1.toCharArray();
        for (char aChar : chars) {
            if (characterIntegerMap.containsKey(aChar)) {
                characterIntegerMap.put(aChar, characterIntegerMap.get(aChar) + 1);
            } else {
                characterIntegerMap.put(aChar, 1);
            }
        }

        char chars0[] = s2.toCharArray();
        for (char aChar : chars0) {
            if (!characterIntegerMap.containsKey(aChar) || characterIntegerMap.get(aChar) == 0) {
                return Boolean.FALSE;
            } else {
                characterIntegerMap.put(aChar, characterIntegerMap.get(aChar) - 1);
            }
        }
        return Boolean.TRUE;
    }
}
