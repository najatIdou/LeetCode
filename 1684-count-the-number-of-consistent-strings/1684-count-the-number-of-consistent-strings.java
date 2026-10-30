class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        boolean bln=false;
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                    if(allowed.contains(String.valueOf(words[i].charAt(j)))){
                        bln=true;
                        continue;
                    }else{
                        bln=false;
                        break;
                    }
            }
            if(bln==true){
                count++;
            }
        }
        return count;
    }
}