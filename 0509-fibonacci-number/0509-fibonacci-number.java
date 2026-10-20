class Solution {
    public int fib(int n) {
        int sum=0;
		int first=0,second=first+1,result=0;
        if(n==1) {
			result=1;
		}
		for(int i=1;i<n;i++) {
			result=first+second;
			first=second;
			second=result;
		}
		return result;
    }
}