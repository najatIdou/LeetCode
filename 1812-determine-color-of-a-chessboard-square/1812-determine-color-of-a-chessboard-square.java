class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
        String chars = "abcdefgh";
        int num = coordinates.charAt(1)-'0', index=0;
        for(int i=0; i<chars.length(); i++){
          if(chars.charAt(i)==ch){
           index=i+1;
           break; 
          }
        }
        if((num%2==0 & index%2==0) || (num%2!=0 & index%2!=0)){
          return false;
        }
        return true;
        
    }
}