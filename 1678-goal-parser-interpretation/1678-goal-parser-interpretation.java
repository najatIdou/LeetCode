class Solution {
    public String interpret(String command) {
        String s="";
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i)=='G'){
                s+='G';
            }else if(command.charAt(i)=='('){
              i++;
                if(command.charAt(i)==')'){
                    s+='o';
                    //i++;
                }else if(command.charAt(i)=='a'){
                    i++;
                    if(command.charAt(i)=='l'){
                        i++;
                        if(command.charAt(i)==')'){
                            s+="al";
                        }
                    }
                }
            }
        }
        return s;
    }
}