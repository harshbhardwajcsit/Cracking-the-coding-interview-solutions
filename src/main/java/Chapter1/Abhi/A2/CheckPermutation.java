package Chapter1.Abhi.A2;

public class CheckPermutation {

    public boolean toCheckPermutation(String s1, String s2){

        if(s1 == s2){
            return true;
        }
        if(s1 == null || s2==null || s1.isEmpty()|| s2.isEmpty()){
            return false;
        }
        if(s1.length() != s2.length()){
            return false;
        }
        int[] tempAray = new int[128];
        char[] s1Char = s1.toCharArray();
        char[] s2Char = s2.toCharArray();
        for(int i=0;i<s1.length();i++){
            int charAscii = s1Char[i];
            tempAray[charAscii]++;
        }
        for(int i=0; i<s2.length();i++){
            int charAscii = s2Char[i];
            tempAray[charAscii]--;
        }
       for(int i=0;i<tempAray.length;i++){
            if(tempAray[i]!=0){
                return false;
            }
       }
       return true;
    }
}
