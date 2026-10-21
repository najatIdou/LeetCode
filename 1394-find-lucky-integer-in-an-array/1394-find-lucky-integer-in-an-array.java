class Solution {
    public int findLucky(int[] arr) {
        int count=1, lucky=0;
        for(int i=0; i<arr.length; i++){
            count=1;
            for(int j=0; j<arr.length; j++){
                if(i==j){
                    continue;
                }
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==arr[i] && arr[i]>lucky){
                lucky=arr[i];
            }
        }
        if(lucky!=0){
            return lucky;
        }
        return -1;
    }
}