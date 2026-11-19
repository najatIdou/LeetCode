class Solution {
    public boolean canJump(int[] nums) {
        int maxreach=0;
        for(int i=0; i<nums.length; i++){
            if(maxreach<i){
                return false;
            }else{
                int numb= i+nums[i];
                if(numb>maxreach) maxreach=numb;
            }
        }
        return true;
    }
}