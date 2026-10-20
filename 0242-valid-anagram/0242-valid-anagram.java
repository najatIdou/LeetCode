class Solution {
    public boolean isAnagram(String str1, String str2) {
        int count1=0, count2=0;
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] chars1 = str1.toCharArray();
        Arrays.sort(chars1);
        String sorted1 = new String(chars1);
        
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars2);
        String sorted2 = new String(chars2);
        for(int i=0; i<str1.length(); i++){
          if(sorted1.charAt(i)!=sorted2.charAt(i)){
            return false; 
          }
        }
        return true;
    }
}