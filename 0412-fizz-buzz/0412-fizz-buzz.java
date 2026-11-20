class Solution {
    public List<String> fizzBuzz(int n) {
        String[] arr = new String[n];
        int num = 1;
        for(int i=0; i<arr.length; i++){
            if(num%3==0 && num%5==0){
                arr[i]="FizzBuzz";
            }else if(num%3==0){
                arr[i]="Fizz";
            }else if(num%5==0){
                arr[i]="Buzz";
            }else{
                arr[i]=String.valueOf(num);
            }
            num++;
        }
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        return list;
    }
}