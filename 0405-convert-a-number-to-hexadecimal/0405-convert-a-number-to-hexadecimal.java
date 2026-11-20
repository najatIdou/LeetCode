class Solution {
    public String toHex(int num) {
        int result=0, i=0;
        ArrayList<Integer> list= new ArrayList<>();
        String str="";
        if(num==0) return str="0";
        Character[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        while(num!=0){
            result = num & 15;
            list.add(result);
            num = num >>> 4;
            i++;
        }
        for(int j=list.size()-1; j>=0; j--){
          str+=hexa[list.get(j)];
        }
        return str;
    }
}