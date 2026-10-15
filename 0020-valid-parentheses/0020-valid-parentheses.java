class Solution {
    public boolean isValid(String str) {
        Stack<Character> chartack = new Stack<>();
	
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='('|| str.charAt(i)=='{' || str.charAt(i)=='[') {
					char lastone =str.charAt(i);
					chartack.push(lastone);
			}
			if(chartack.isEmpty()) {
				return false;
			}
			if(str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']') {
				char stackchar = chartack.peek();
				if(str.charAt(i)==')') {
					if(stackchar=='(') {
						chartack.pop();
					}else {
						return false;
					}
				}else if(str.charAt(i)==']') {
					if(stackchar=='[') {
						chartack.pop();
					}else {
						return false;
					}
				}else if(str.charAt(i)=='}') {
					if(stackchar=='{') {
						chartack.pop();
					}else {
						return false;
					}
				}
			}
		}
		if(!chartack.isEmpty()) {
			return false;
		}
		return true;
    }
}