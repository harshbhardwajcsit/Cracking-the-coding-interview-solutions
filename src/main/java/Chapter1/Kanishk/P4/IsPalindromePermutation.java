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

	public boolean checkIsPalindromeAlphabets(String str) {

		int bitphrase = createBitVector(str);

		return isBitVectorPalindrome(bitphrase);
	}

	private boolean isBitVectorPalindrome(int bitphrase) {

		return bitphrase==0 || ((bitphrase-1)&bitphrase)==0;
	}

	private int createBitVector(String str) {

		int bitvector = 0;

		for(char c: str.toCharArray()) {

			int x= getCharValue(c);

			if(x==-1) System.out.println("-1 for " + c);

			int mask = 1<<x;

			if((bitvector & mask) ==0) {
				bitvector |= mask;
			}else {
				bitvector &= ~mask;
			}
		}

		return bitvector;
	}

	private int getCharValue(char c ){
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);

		if(a<=val && val <= z)
			return val-a;
		else
		  return -1;
	}

}
