class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
		for(int i=1; i<nums.length; i++) {
			if(nums[i]!=nums[i-1]) {
				nums[j] = nums[i];
				j++;
			}else {
				continue;
			}
		}
		System.out.println(Arrays.toString(nums));
		return j;
    }
}