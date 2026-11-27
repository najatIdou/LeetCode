class Solution {
    public boolean isPerfectSquare(int num) {
        int start=1, end=num, middle=start + (end-start)/2;
        while(start<=end){
            if((long)middle*middle==num){
                return true;
            }else if((long)middle*middle<num){
                start=middle+1;
                middle=start+(end-start)/2;
            }else{
                end=middle-1;
                middle=start+(end-start)/2;
            }
        }
        return false;
    }
}