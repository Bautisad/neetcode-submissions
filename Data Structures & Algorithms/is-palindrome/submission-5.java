class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] curString = s.toLowerCase().toCharArray();

        while(left < right){
            if(!Character.isLetterOrDigit(curString[left])){
                left++;
            } else if(!Character.isLetterOrDigit(curString[right])){
                right--;
            } else if(curString[left] != curString[right]){
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
