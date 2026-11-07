class Solution {
    public String largestOddNumber(String num) {
         String tmp="";
        int index=num.length()-1;
            while(index>=0 && num.charAt(index)%2==0){
              index--;
            }
            for(int i = 0; i<=index; i++){
              tmp+=num.charAt(i);
            }
        return tmp;
    }
}