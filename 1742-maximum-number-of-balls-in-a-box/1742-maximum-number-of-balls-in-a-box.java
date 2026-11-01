class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] arr=new int[highLimit-lowLimit+1];
        double result=0;
        int s=lowLimit;
        for(int j=0; j<=highLimit-lowLimit; j++){
            while(s<=highLimit){
                if(s>9){
                    int n=s, sum=0, max=0;
                    while(n>0){
                        result=n%10;
                        n=n/10;
                        sum+=(int)result;
                    }  
                    arr[j]=sum;
                    s++;
                    break;
                }else{
                    arr[j]=s;
                    s++;
                    break;
                }
            }
        }
        int[] boxes = new int[46];

        for(int i = 0; i < arr.length; i++){
            boxes[arr[i]]++;
        }
        
        int max = 0;
        
        for(int i = 0; i < boxes.length; i++){
            if(boxes[i] > max){
                max = boxes[i];
            }
        }
        
        return max;
    }
}