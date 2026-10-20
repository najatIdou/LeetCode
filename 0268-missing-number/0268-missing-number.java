class Solution {
    public int missingNumber(int[] nums) {
      int sum1=0, sum2=0, result=0;
      int number =nums.length;
      for(int i=1; i<=number; i++){
        sum1+=i;
      }
      for(int i=0; i<nums.length; i++){
        sum2+=nums[i];
      }
        result =sum1-sum2;
      return result;
    }
}