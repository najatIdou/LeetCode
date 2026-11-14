class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max=0, left=0;
        for(int right=left; right<s.length(); right++){
            if(set.contains(s.charAt(right))){
                if(set.size()>max) max=set.size();
                set.clear();
                right=left;
                left++;
            }else{
                set.add(s.charAt(right));
                if(set.size()>max) max=set.size();
            }
        }
        return max;
    }
}