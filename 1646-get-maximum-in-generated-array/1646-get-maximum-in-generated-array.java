class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums=new int[n+1];
        int index = 0;
        for(int i=0; i<n+1; i++){
            if(i==0){
                nums[index++]=0;
            }else if(i==1){
                nums[index++]=1;
            }else if(i%2==0){
                nums[index++]=nums[i/2];
            }else{
                nums[index++]=nums[i/2]+nums[(i/2)+1];
            }
        }
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}