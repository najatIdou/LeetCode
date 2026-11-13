class Solution {
    public int finalValueAfterOperations(String[] o) {
        int result=0;
        for(int i=0; i<o.length; i++){
            if(o[i].equals("--X") || o[i].equals("X--")){
                result--;
            }else {
                result++;
            }
        }
        return result;
    }
}