class Solution {
    public String truncateSentence(String s, int k) {
        String str="";
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                str+=s.charAt(i);
            }else{
                 str+=" ";
                count++;
            }
            if(count==k){
                break;
            }
        }
        str=str.trim();
        return str;
    }
}