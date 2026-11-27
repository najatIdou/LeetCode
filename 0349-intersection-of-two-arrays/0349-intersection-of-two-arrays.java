class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int n: set){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        set.clear();
        for(int i=0; i<nums2.length; i++){
            set.add(nums2[i]);
        }
        for(int n: set){
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)>1)list.add(n);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}