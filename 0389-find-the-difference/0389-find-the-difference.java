class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
        map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
        map.put(c, map.getOrDefault(c,0)-1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() != 0) {
            return entry.getKey();
        }
        }
        return 's';
    }
}