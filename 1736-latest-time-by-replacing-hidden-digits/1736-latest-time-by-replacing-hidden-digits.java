class Solution {
    public String maximumTime(String time) {
        String newT="";
        if(time.charAt(0)=='?' && time.charAt(1)=='?' && time.charAt(3)=='?' && time.charAt(4)=='?'){
          return  newT="23:59";
        }
        for(int i=0; i<time.length(); i++){
            if(time.charAt(i)=='?'){
                if(i==0){
                    if(time.charAt(i+1)=='?'){
                        newT+="23";
                        i++; continue;
                    }
                    if(time.charAt(i+1)<='3'){
                        newT+='2';
                    }else{
                        newT+='1';
                    }
                }else if(i==1){
                    if(time.charAt(i-1)<'2'){
                        newT+='9';
                    }else{
                        newT+='3';
                    }
                }else if(i==3){
                    newT+='5';
                }else if(i==4){
                    newT+='9';
                }
            }else{
                newT+=time.charAt(i);
            }
        }
        return newT;
    }
}