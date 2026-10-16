class Solution {
    public int singleNumber(int[] nums) {
        int number=0;
		for(int i=0; i<nums.length-1; i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]<nums[i]) {
					int temp = nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}else{
					continue;
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(i==nums.length-1) {
				number=nums[i];
				break;
			}else if(nums[i]==nums[i+1]) {
				i++;
			}else{
				number=nums[i];
				break;
			}
		}
		return number;
    }
}