package Chapter1.Abhi;

public class URLify {

    public String toURLify(String str){
        if(str == null && str.isEmpty()){
            return "Empty or null String";
        }
        char[] charArray = str.trim().toCharArray();
        int oldArrayindex = charArray.length-1;
        int spaceCount = 0;
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]==' '){
                spaceCount++;
            }
        }
        char[] newArray = new char[charArray.length+spaceCount*2];
        for(int i=newArray.length-1;i>=0;){
            if(charArray[oldArrayindex]!= ' '){
                newArray[i]=charArray[oldArrayindex--];
                i--;
            }
            else{
                newArray[i--]='0';
                newArray[i--]='2';
                newArray[i--]='%';
                oldArrayindex--;
            }
        }
        return new String(newArray);
    }
}
