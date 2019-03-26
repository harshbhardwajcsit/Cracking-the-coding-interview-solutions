package Chapter1.Abhi;

// here we are putting the string in some range(0-31) so as to fit in int (4 byte) now we perform bit manipulation
// operation on this int. Created the mask with shifting operator to know the toggle position. AND operation is
// done to check if the bit is already set or not. If set then unset it with ~mask else set it.
// 100 & 011 will yield 0.
public class PalindromePermutation {

    // assuming string only has letters
    public boolean checkPalindromPermutation(String str){
        int bitVector = 0;
        for(char ch : str.toCharArray()){
            int index = getNumericValue(ch);
            int mask = 1<< index;
            if((bitVector & mask) == 0){
                bitVector |= mask;
            }else{
                bitVector &= (~mask);
            }
        }
        if((bitVector & (bitVector-1))== 0){
            return true;
        } else {
            return false;
        }
    }


    // done to put it in some range so as to fit in 0-31
    private int getNumericValue(char ch){
        int chVal = Character.getNumericValue(ch);
        int aVal = Character.getNumericValue('a');
        int zVal = Character.getNumericValue('z');
        if(ch >= aVal){
          chVal = ch-aVal;
        }
        return chVal;
    }
}
