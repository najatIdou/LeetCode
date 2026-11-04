class Solution {
    public int numDifferentIntegers(String word) {
        String str="", s="";
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)=='0' || word.charAt(i)=='1' || word.charAt(i)=='2' || word.charAt(i)=='3' || word.charAt(i)=='4' || word.charAt(i)=='5' || word.charAt(i)=='6' || word.charAt(i)=='7' || word.charAt(i)=='8' || word.charAt(i)=='9'){
                str+=word.charAt(i);
            }else{
                str+=" ";
            }
        }
        str=" "+str+" ";
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
          while(str.charAt(i)!=' '){
              s+=str.charAt(i);
              i++;
          }
          if(s!=""){
            s = s.replaceFirst("^0+(?!$)", "");
            if(!list.contains(s)){
                list.add(s);
            }
            s="";
          }
        }
        return list.size();
    }
}