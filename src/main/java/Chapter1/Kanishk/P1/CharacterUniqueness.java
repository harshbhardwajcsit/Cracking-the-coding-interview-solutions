package Chapter1.Kanishk.P1;

import java.util.Arrays;

public class CharacterUniqueness {

    public boolean isUnique(String str) {

        char arr[] = str.toCharArray();


        int maxascii=0;
        for(int i=0; i<arr.length;i++){
            maxascii = maxascii>(int)arr[i]?maxascii:(int)arr[i];
        }

        Boolean copyArr[] = new Boolean[maxascii+1];
        Arrays.fill(copyArr, Boolean.FALSE);

        for(int i=0; i<arr.length;i++){
            if(copyArr[arr[i]]==true){
                return false;
            }
            copyArr[arr[i]]=true;
        }

        return true;
    }

}
