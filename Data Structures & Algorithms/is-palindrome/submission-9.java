class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] sChar = s.toLowerCase().toCharArray();
        
        while(left < right){
            if(!Character.isLetterOrDigit(sChar[left])){
                left++;
            } else if (!Character.isLetterOrDigit(sChar[right])){
                right--;
            } else if (sChar[left] != sChar[right]){
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
