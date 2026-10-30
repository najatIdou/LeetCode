class Solution {
    public String reformatNumber(String number) {
        String s="";
        for(int i=0; i< number.length(); i++){
            if(number.charAt(i) == '-' || number.charAt(i) == ' '){
                continue;
            }
            s+=number.charAt(i);
        }
        number="";
        int i=0;
        int n=s.length();
        while(n-i > 4){
            number+= s.substring(i,i+3) + "-";
            i+=3;
        }
        if(n-i == 4){
            number+= s.substring(i,i+2)+"-"+s.substring(i+2);
        }else{
            number+=s.substring(i);
        }
        return number;
    }
}