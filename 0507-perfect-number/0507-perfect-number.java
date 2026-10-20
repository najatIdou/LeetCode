class Solution {
    public boolean checkPerfectNumber(int n) {
        int sum=0;
		if(n<=1) {
			return false;
		}
		for(int i=1; i<n; i++) {
			if(n%i==0 && i>0) {
				sum+=i;
			}
		}
		if(sum==n) {
			return true;
		}
		return false;
    }
}