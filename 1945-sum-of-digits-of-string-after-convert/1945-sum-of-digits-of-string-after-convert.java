import java.math.BigInteger;
class Solution {
    public int getLucky(String s, int k) {
        BigInteger number = BigInteger.ZERO;
        int index=0;
        int[] nums=new int[s.length()];
        for(int i=0; i<s.length(); i++){
            nums[index]=s.charAt(i)-'a'+1;
            index++;
        }
        for (int num : nums) {
            number = number.multiply(BigInteger.TEN.pow(String.valueOf(num).length())).add(BigInteger.valueOf(num));
        }
        for(int i=0; i<k; i++){
          double result=0;
            while(!number.equals(BigInteger.ZERO)){
                result += number.remainder(BigInteger.TEN).intValue();
                number = number.divide(BigInteger.TEN);
            }
            number= BigInteger.valueOf((long) result);
        }
        return number.intValue();
    }
}