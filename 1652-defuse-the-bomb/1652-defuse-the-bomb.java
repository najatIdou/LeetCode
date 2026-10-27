class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] nums= new int[code.length];
      for(int i=0; i<code.length; i++){
        nums[i]=code[i];
      }
        if(k==0){
            for(int i=0; i<code.length; i++){
                code[i]=0;
            }
        }else if(k>0){
            for(int i=0; i<code.length; i++){
              int sum=0;
                for(int count=0; count<k; count++){
                  int index = (i + count + 1) % code.length;
                  if(index<code.length){
                    sum+=nums[index];
                    index++;
                  }else{
                    continue;
                  }
                }
              code[i]=sum;
            }
        }else if(k<0){
          k= Math.abs(k);
          for(int i=0; i<code.length; i++){
              int sum=0;
                for(int count=0; count<k; count++){
                  int index = (i - count - 1 + code.length) % code.length;
                  if(index<code.length){
                    sum+=nums[index];
                    index++;
                  }else{
                    continue;
                  }
                }
              code[i]=sum;
            }
        }
        return code;
    }
}