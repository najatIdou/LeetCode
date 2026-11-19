class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums= new int[n][n];
        int number=1, top=0, bottom =n-1, left=0, right=n-1;
        while(number<=n*n){
            for (int j = left; j <= right; j++) {
                nums[top][j] = number++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                nums[i][right] = number++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                nums[bottom][i] = number++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                nums[i][left] = number++;
            }
            left++;
        }
        return nums;
    }
}

// 0,0  0,1  0,2
// 1,0  1,1  1,2
// 2,0  2,1  2,2
