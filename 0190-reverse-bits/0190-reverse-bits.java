class Solution {
    public int reverseBits(int n) {
        String s="", str=String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        for(int i=str.length()-1; i>=0; i--){
            s+=str.charAt(i);
        }
        
        return (int) Long.parseLong(s, 2);
    }
}