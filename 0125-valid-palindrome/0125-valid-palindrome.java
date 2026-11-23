class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim().toLowerCase();
        String str="", srt="";
        for(int i=0; i<s.length(); i++){
        if(((int)s.charAt(i)<=122 && (int)s.charAt(i)>=97) || ((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)){
            str+=s.charAt(i);
        }
        }
        for(int i=s.length()-1; i>=0; i--){
        if(((int)s.charAt(i)<=122 && (int)s.charAt(i)>=97) || ((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)){
            srt+=s.charAt(i);
        }
        }
        if(str.equals(srt)) return true;
        return false;

    }
}