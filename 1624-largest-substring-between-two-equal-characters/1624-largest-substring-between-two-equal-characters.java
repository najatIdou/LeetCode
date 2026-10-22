class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int count=0, longer=-1, index=0;
        for(int i=0; i<s.length(); i++){
            count=0;
            for(int j=0; j<s.length(); j++){
                if(i==j){
                    continue;
                }
                if(s.charAt(i)==s.charAt(j)){
                    index=i+1;
                    count=0;
                    while(index<j){
                        count++;
                        index++;
                    }
                    if(count>longer){
                        longer=count;
                    }
                }
            }
        }
        return longer;
    }
}