class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer,Integer> map= new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int num : nums1){
          set.add(num);
        }
        for(int num : set){
          map.put(num, map.getOrDefault(num, 0) + 1);
        }
        set.clear();
        for(int num : nums2){
          set.add(num);
        }
        for(int num : set){
          map.put(num, map.getOrDefault(num, 0) + 1);
        }
        set.clear();
        for(int num : nums3){
          set.add(num);
        }
        for(int num : set){
          map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> nn= new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                nn.add(entry.getKey());
            }
        }
        return nn;
    }
}