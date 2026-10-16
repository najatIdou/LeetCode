class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newarray= new int[m+n];
        int s=m;
        for(int i=0; i<m; i++){
            newarray[i]=nums1[i];
        }
        for(int i=0; i<n;i++){
            newarray[s]=nums2[i];
            s++;
        }
        Arrays.sort(newarray);
        for(int i=0; i<m+n; i++){
            nums1[i]=newarray[i];
        } 
    }
}