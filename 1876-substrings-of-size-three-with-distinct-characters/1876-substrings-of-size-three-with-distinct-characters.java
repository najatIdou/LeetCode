class Solution {
    public int countGoodSubstrings(String s) {
        ArrayList<String> list= new ArrayList<>();
        int count=0;
        String str="";
        for(int i=0; i<s.length(); i++){
                str+=s.charAt(i);
                if(str.length()==3){
                    list.add(str);
                    str="";
                    i-=2;
                }
        }
        for (int i = 0; i < list.size(); i++) {
          String word = list.get(i);
          ArrayList<Character> l= new ArrayList<>();
          for (int j = 0; j < word.length(); j++) {
            if(!l.contains(word.charAt(j))) l.add(word.charAt(j));
          }
          if(l.size()==3){
            count++;
          }
        }
        return count;
    }
}