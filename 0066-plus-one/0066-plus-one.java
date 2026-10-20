class Solution {
    public int[] plusOne(int[] digits) {
       int index=digits.length-1;
      while( index>=0 && digits[index]==9){
          digits[index]=0;
          index--; 
      }
      if(index<0){
        int[] newarr=new int[digits.length+1];
        newarr[0]=1;
        for(int i=1; i<=digits.length; i++){
          newarr[i]=0; 
        }
        return newarr;
      }else{
        if(digits[index]!=9){
          digits[index]=digits[index]+1;
        }
      }
      return digits;
    }
}