class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        int small=0, large=nums.length-1;
        int middle=(int)(large+small)/2;
        while(large>=small){
            if(nums[middle]<target){
                small=middle+1;
                middle=(large+small)/2;
            }else if(nums[middle]>target){
                large=middle-1;
                middle=(large+small)/2;
            }else if(target== nums[middle]){
                return middle;
            }
        } 
        return small;
    }
}
// 0 1 2 3 4  5     2
// 1 3 4 7 9 88