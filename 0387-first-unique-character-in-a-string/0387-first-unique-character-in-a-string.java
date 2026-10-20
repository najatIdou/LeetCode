class Solution {
    public int firstUniqChar(String str) {
        boolean ch = false;
		char charac = 0;
		for(int i=0; i<str.length(); i++) {
			ch=false;
			for(int j=0; j<str.length(); j++) {
                if(i==j){
	               continue; 
	            }
				if(i!=0) {
					if(str.charAt(i)==str.charAt(i-1)) {
						ch=true;
						break;
					};
				}
				if(str.charAt(i)==str.charAt(j)) {
					ch=true;
					break;
				}
			}
			if(ch==false) {
				charac=str.charAt(i);
				return i;
			}
		}
		return -1;
    }
}