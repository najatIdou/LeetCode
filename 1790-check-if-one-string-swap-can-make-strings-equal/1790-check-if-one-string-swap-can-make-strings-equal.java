import java.util.Arrays;
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] S1= s1.toCharArray();
        char[] S2= s2.toCharArray();
        Arrays.sort(S1);Arrays.sort(S2);
        boolean rs=true;
        for(int i=0; i<S1.length; i++){
            if(S1[i]!=S2[i]){
                return false;
            }
        }int count=0;
        if(rs==true){
            for(int i=0; i<s1.length(); i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    count++;
                }
                if(count>2){
                    return false;
                }
            }
        }
        return true;
    }
}