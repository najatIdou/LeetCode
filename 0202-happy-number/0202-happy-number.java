import java.util.HashSet;
class Solution {
    public boolean isHappy(int n) {
        double sum=0;
		double result=0;
		int temp=n;
		HashSet<Integer> numbers= new HashSet<Integer>();

		while(!numbers.contains(n) && n!=1){
			numbers.add(n);
			temp = n;
			sum=0;
			while(temp>0) {
				result=temp%10;
				temp=(int)temp/10;
				sum+=Math.pow(result,2);
			}
			n=(int)sum;
		}
		return n==1; 
    }
    
}