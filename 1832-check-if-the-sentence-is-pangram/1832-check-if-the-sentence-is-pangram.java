class Solution {
    public boolean checkIfPangram(String sentence) {
        ArrayList<Character> list = new ArrayList<>();
        for(int j=0; j<sentence.length(); j++){
            if(!list.contains(sentence.charAt(j))){
                list.add(sentence.charAt(j));
            }
        }
        if(list.size() != 26){
            return false;
        }
        return true;
    }
}