class Solution {
    public int secondHighest(String s) {
        String str="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0' || s.charAt(i)=='1' || s.charAt(i)=='2' || s.charAt(i)=='3' || s.charAt(i)=='4' || s.charAt(i)=='5' || s.charAt(i)=='6' || s.charAt(i)=='7' || s.charAt(i)=='8' || s.charAt(i)=='9'){
                str+=s.charAt(i);
            }
        }
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            if(list.contains(str.charAt(i))){
                continue;
            }else{
                list.add(str.charAt(i));
            }
        }
        Collections.sort(list);
        if(list.size()>1){
            return Character.getNumericValue(list.get(list.size()-2));
        }
        return -1;
    }
}