class Solution {
    public boolean checkZeroOnes(String s) {
        int count1=0, count0=0, max0=0, max1=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                count1++;
                int j=i+1;
                while(j<s.length() && s.charAt(j)=='1'){
                    count1++;
                    j++;
                }
                if(count1>max1) max1=count1; count1=0; i=j-1;
            }else if(s.charAt(i)=='0'){
                count0++;
                int j=i+1;
                while(j<s.length() && s.charAt(j)=='0'){
                    count0++;
                    j++;
                }
                if(count0>max0) max0=count0; count0=0; i=j-1;
            }
        }
        if (max1>max0){
            return true;
        }
        return false;
    }
}