package Chapter1.Abhi;

public class StringCompression {

    public String performCompression(String str){
        if(str == null || str.isEmpty() || str.equals("")){
            return str;
        }
        char runningChar = str.charAt(0);
        int tempCharCount = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(char ch: str.toCharArray()){
            if(ch == runningChar){
                tempCharCount++;
                continue;
            }else{
                stringBuilder.append(runningChar).append(tempCharCount);
                runningChar = ch;
                tempCharCount = 1;
            }
        }
        stringBuilder.append(runningChar).append(tempCharCount);
        return (stringBuilder.toString().length() < str.length())?stringBuilder.toString():str;
    }
}
