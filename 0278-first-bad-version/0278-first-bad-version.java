/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start= 1, end= n, middle= start + (end-start)/2, number=0;
        while(start <= end){
            if(isBadVersion(middle)){
                number=middle;
                end=middle-1;
                middle=start + (end-start)/2;
            }else{
                start=middle+1;
                middle=start + (end-start)/2;
            }
        }
        return number;
    }
}