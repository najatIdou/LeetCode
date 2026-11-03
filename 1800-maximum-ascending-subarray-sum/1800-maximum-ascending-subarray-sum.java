class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0], max=nums[0];
        int[] arr=new int[nums.length];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]){
              sum+=nums[i+1];
            }else{
                sum=nums[i+1];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}