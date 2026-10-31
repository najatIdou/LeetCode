class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int half=(int)s.length()/2;
        String m="",n="";
        for(int i=0; i<half; i++){
            m+=s.charAt(i);
        }
        for(int i=half; i<s.length(); i++){
            n+=s.charAt(i);
        }
        int count1=0, count2=0;
        for(int i=0; i<half; i++){
            if(String.valueOf(m.charAt(i)).matches(".*[aeiou].*")) count1++;
            if(String.valueOf(n.charAt(i)).matches(".*[aeiou].*")) count2++;
        }
        if(count1!=count2){
            return false;
        }
        return true;
    }
}