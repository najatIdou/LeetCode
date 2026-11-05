class Solution {
    public static long counter(String str){
        long num=0;
        for(int i=0; i<str.length(); i++){
            num+=(long)str.charAt(i)-'a';
            num*=10;
        }
        return num;
      }
    public static boolean isSumEqual(String f, String s, String t) {
        /*long fnum=0, snum=0, tnum=0;
        for(int i=0; i<f.length(); i++){
            fnum+=(long)f.charAt(i)-'a';
            fnum*=10;
        }
        for(int i=0; i<s.length(); i++){
            snum+=(long)s.charAt(i)-'a';
            snum*=10;
        }
        for(int i=0; i<t.length(); i++){
            tnum+=(long)t.charAt(i)-'a';
            tnum*=10;
        }
        return fnum+snum==tnum*/
        return counter(f)+counter(s)==counter(t);
    }
}