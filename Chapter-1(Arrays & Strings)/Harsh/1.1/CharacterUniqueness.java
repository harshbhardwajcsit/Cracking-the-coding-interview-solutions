import java.util.Arrays;

class CharacterUniqueness {
    boolean checkUnique(String string) {

        if (string == null)
            return Boolean.FALSE;

        if (string.isEmpty())
            return Boolean.FALSE;

        char[] chars = string.toCharArray();
        Boolean[] booleans = new Boolean[127];
        Arrays.fill(booleans, Boolean.FALSE);
        boolean uniqueCharacter = Boolean.TRUE;
        for (char aChar : chars) {
            if (booleans[(int) Character.toLowerCase(aChar)].compareTo(Boolean.TRUE) == 0 && Character.isAlphabetic(Character.toLowerCase(aChar))) {
                uniqueCharacter = Boolean.FALSE;
                break;
            } else {
                booleans[(int) Character.toLowerCase(aChar)] = Boolean.TRUE;
            }
        }
        return uniqueCharacter;
    }
}
