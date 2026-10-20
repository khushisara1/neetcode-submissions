class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length()-1;
        int i=0;
        while(i<len){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(len))){
                len--;
            }
            else {
                if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(len))){
                return false;
                }i++;
                len--;
            }
           
        }
        return true;
    }
}
