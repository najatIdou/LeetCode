class Solution {
    public int reverse(int x) {
        double result=0;
        long numb=0;
        while(x!=0){
            result=x%10;
            x=(int)x/10;
            numb=numb*10+(int)result;
        }
        if(numb>2147483647 || numb<-2147483648){
            return 0;
        }
        return (int)numb;
    }

}