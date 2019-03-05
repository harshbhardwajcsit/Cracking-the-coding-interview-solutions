package Chapter1.Kanishk.P4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class IsPalindromePermutation {

	public boolean checkIsPalindromePermute(String input) {

		if(input==null || input.length()==0) return false;
		
		char strarr[] = input.toCharArray();
		

		Map<Character,Integer> map = new HashMap<>();
		
		for(char c :strarr) {
			
			Optional<Integer> value = Optional.ofNullable(map.get(c));
			
			value.ifPresent(val->map.put(c,++val));
			
			if(!value.isPresent()) map.put(c,1);
			
		}
		
		int odds = 0;
		
		for(Entry<Character,Integer> e:map.entrySet()) {
			if(e.getValue()%2!=0) odds++;
		}
		
		if(odds>1) return false;
		
		return true;
	}
	
	public boolean checkIsPalindromeAscii(String str) {
		
		
		int checker =0;
		
		
		
		
		return false;
	}

}
