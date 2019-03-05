package Chapter1.Kanishk.P2;

public class IsStringPermutation {

	public boolean isPermutationOfString(String input1, String input2) {
		
		if(input1 ==null || input2==null) return false;
		
		if(input1.length()==0 || input2.length()==0) return false;
		
		if(input1.length()!=input2.length()) return false;
		
		int arr[] = new int[128]; // Assuming characters are ascii
		
		char str1[] = input1.toCharArray();
		
		for(char c:str1) {
			arr[c]+=1;
		}		
		
		char str2[] = input2.toCharArray();
		for(char c:str2) {
			arr[c]-=1;
		}
		
		for(int i:arr) {
			if(i!=0) return false;
		}
		
		return true;
	}	

}
