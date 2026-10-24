class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<points.length; i++){
          list.add(points[i][0]);
        }
        Collections.sort(list);
        int max=0;
        for(int i=0; i<list.size()-1; i++){
          if(list.get(i+1)-list.get(i)>max){
            max=list.get(i+1)-list.get(i);
          }
        }
        return max;
    }
}