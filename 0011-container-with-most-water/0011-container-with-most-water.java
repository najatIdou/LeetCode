class Solution {
    public int maxArea(int[] height) {
        int area=0, left=0, rigth=0, max=0;
        //int i=0, j=i+1;
        /*for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                    area=(j-i)*Math.min(height[i],height[j]);
                    if(area>max) max=area;
            }
        }
        int i=0, j=i+1;
        while(i<j){
          if(j==height.length){
            i++;
            j=i+1;
            continue;
          }
          if(i==height.length) break;
            area=(j-i)*Math.min(height[i],height[j]);
            if(area>max) max=area;
            j++;
        }*/
        int i=0, j=height.length-1;
        while(i<j){
            area=(j-i)*Math.min(height[i],height[j]);
            if(area>max) max=area;
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}