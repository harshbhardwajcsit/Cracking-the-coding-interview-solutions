package Chapter1.Kanishk.P3;

public class URIConvert {

	public String convertToUri(String input) {
		
		if(input==null || input.length()==0) return null;
		
		char str[]=input.toCharArray();
		
		int whitespacetrail=str.length;
		
		while(str[whitespacetrail-1]==' ') whitespacetrail--;
		
		int index=str.length-1;
		
		 for(int i=whitespacetrail-1;i>=0;i--) {
			 if(str[i]==' ') {
				 str[index-2]='%';
				 str[index-1]='2';
				 str[index]='0';
				 index-=3;
			 }else {
				 str[index--]=str[i];
			 }
			 
		 }
		
		
		return String.valueOf(str);
	}

}
