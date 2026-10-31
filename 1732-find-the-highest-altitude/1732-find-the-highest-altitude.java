class Solution {
    public int largestAltitude(int[] gain) {
        // n=5
        // n+1=6
        // 0  1 2 3 4  5 
        // 0 -5 1 5 0 -7
        // 0 -5 -4 1 1 -6
        int altitude=0, max=0;
        for(int i=0; i<gain.length; i++){
            altitude+=gain[i];
            if(altitude>=max){
                max=altitude;
            }
        }
        return max;
    }
}