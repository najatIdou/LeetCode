class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.charAt(0)!='1'){
            return false;
        }
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='1'){
                for(int j=i; j>=0; j--){
                    if(s.charAt(j)!='1'){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}