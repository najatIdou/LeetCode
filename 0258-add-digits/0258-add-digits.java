class Solution {
    public int addDigits(int num) {
        double result=0;
        int sum=0;
        while(num>=10){
            while (num >0) {
              result=num%10;
              num=(int)num/10;
              sum+=(int)result;
            }
            if(num==0){
              num=sum; 
              sum=0;
            }
        }
        return num;
    }
}