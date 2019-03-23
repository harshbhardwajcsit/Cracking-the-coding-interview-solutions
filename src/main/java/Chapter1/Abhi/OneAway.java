package Chapter1.Abhi;

public class OneAway {

    public boolean checkStringForOneAway(String str1,String str2){
        char[] charString1 = str1.trim().toCharArray();
        char[] charString2 = str2.trim().toCharArray();
        boolean flag = false;
        if(charString1.length+1 == charString2.length){
            flag = checkForInsert(charString1,charString2);
        }else if(charString1.length-1 == charString2.length){
            flag = checkForRemoval(charString1,charString2);
        }else{
            flag = checkForEquality(charString1,charString2);
        }
        return flag;
    }

    private boolean checkForInsert(char[] str1,char[] str2){
        int count = 0;
        for(int i=0,j=0;i<str1.length&&j<str2.length;){
            if(str1[i] == str2[j]){
                i++;
                j++;
            }else{
               count++;
               if(count>1){
                   break;
               }
               j++;
            }
        }
        if(count == 1)
            return true;
        else return false;
    }

    private boolean checkForRemoval(char[] str1,char[] str2){
        int count = 0;
        for(int i=0,j=0;i<str1.length&&j<str2.length;){
            if(str1[i] == str2[j]){
                i++;
                j++;
            }else{
                count++;
                if(count>1){
                    break;
                }
                i++;
            }
        }
        if(count == 1)
            return true;
        else return false;
    }

    private boolean checkForEquality(char[] str1,char[] str2){
        int count = 0;
        for(int i=0,j=0;i<str1.length&&j<str2.length;){
            if(str1[i] == str2[j]){
                i++;
                j++;
            }else{
                count++;
            }
        }
        if(count == 1)
            return true;
        else return false;
    }
}
