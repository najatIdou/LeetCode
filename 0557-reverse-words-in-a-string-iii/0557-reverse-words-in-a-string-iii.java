class Solution {
    public String reverseWords(String str) {
        str.trim();
        str+=" ";
        int count=0;
        String reverced="";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)!=' ') {
                count++;
            }
            if(str.charAt(i)==' ') {
                for(int j=i-1; j>=i-count; j--) {
                  reverced+=str.charAt(j);
                }
                reverced+=' ';
                count=0;
            }
        }
        reverced=reverced.trim();
        return reverced;
    }
}