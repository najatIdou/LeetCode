class Solution {
    public boolean isPalindrome(int x) {
        double result=0;
        int orig=x, numb=0, counter=0;
        while(x>0){
            result=x%10;
            x=(int)x/10;
            counter++;
            numb=numb*10+(int)result;
        }
        if(orig!=numb){
            return false;
        }
        return true;
    }
}