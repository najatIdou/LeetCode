class Solution {
    public String sortSentence(String s) {
        int count=1;
        s=s.trim();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        String str=" ";
        String[] num=new String[count];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9'){
                num[s.charAt(i)-'0'-1]=str;
                str="";
            }else{
                str+=s.charAt(i);
            }
        }
        for(int i=0; i<num.length; i++){
            str+=num[i];
        }
        return str.trim();
    }
}