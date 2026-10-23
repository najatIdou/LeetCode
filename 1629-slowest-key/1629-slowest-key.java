class Solution {
    public char slowestKey(int[] nums, String keysPressed) {
        char s=keysPressed.charAt(0);
        int time=nums[0], max=nums[0];
        for(int i=1; i<nums.length; i++){
            time=nums[i]-nums[i-1];
            if(time>max){
                max=time;
                s=keysPressed.charAt(i);
            }else if(time==max){
                if(keysPressed.charAt(i)>=s){
                  max=time;
                  s=keysPressed.charAt(i);
                } 
            }
        }
        return s;
    }
}