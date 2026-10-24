class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> {
            if (map.get(a) == map.get(b)) {
                return b - a;
            } else {
                return map.get(a) - map.get(b);
            }
        });

        int[] res = new int[nums.length];
        int index = 0;
        for (int num : list) {
            for (int i = 0; i < map.get(num); i++) {
                res[index++] = num;
            }
        }

        return res; 
    }
}