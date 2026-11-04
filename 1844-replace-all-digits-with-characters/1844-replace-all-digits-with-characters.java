class Solution {
    public String replaceDigits(String s) {
        int count=0;
      StringBuilder str = new StringBuilder();
      if((int)s.charAt(0)<65){
       str.append("a"); 
      }
        for(int i=0; i<s.length(); i++){
            if((int)s.charAt(i)<65){
              int num=s.charAt(i)-'0';
                str.append((char)(s.charAt(i-1)+num));
            }else{
              str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}