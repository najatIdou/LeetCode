class Solution {
    public String generateTheString(int n) {
        String s="";
        String str="abcdefghijklmnopqrstuvwxyz";
        if(n%2!=0){
            for(int i=0; i<n; i++){
                s+=str.charAt(0);
            }
        }else{
            for(int i=0; i<n-1; i++){
                s+=str.charAt(0);
            }
            s+=str.charAt(1);
        }
        
        return s;
    }
}