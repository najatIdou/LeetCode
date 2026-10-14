class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] numbers=new int[nums1.length+nums2.length];
        double result=0;
        for(int i=0; i<nums1.length; i++){
            numbers[i]=nums1[i];
        }
        int leng=nums1.length;
        for(int i=0; i<nums2.length; i++){
            numbers[leng]=nums2[i];
            leng++;
        }
        Arrays.sort(numbers);
        if(numbers.length%2==0){
          int middle1 = (int) numbers.length/2;
          return (double)(numbers[middle1]+numbers[middle1-1])/2;
        }else{
          int middle2=(int) numbers.length/2;
          return numbers[middle2];
        }
    }
}