class Solution {
    public int hammingWeight(int n) {
        int count=0;
        String num = Integer.toBinaryString(n);
        for(char c: num.toCharArray()){
            if(c=='1') count++;
        }
        return count;
    }
}