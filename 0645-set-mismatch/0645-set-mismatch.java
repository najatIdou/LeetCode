class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] index= new int[2];
        int n=0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
          if(nums[i]==nums[i+1]){
            index[0]=nums[i];
            break;
          }
        }
        for(int s=1; s<=nums.length; s++){
            while(n!=0 && n<nums.length && nums[n]==nums[n-1]){
                n++;
            }
            if(n==nums.length){
                index[1]=s;
                break;
            }
            if(s!=nums[n]){
              index[1]=s;
              break;
            } 
            n++;
        }
        return index;
    }
}