class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        char[] sCharArray = s.toLowerCase().toCharArray();

        while(left < right){
            if(!Character.isLetterOrDigit(sCharArray[left])){
                left++;
            } else if(!Character.isLetterOrDigit(sCharArray[right])){
                right--;
            } else if(sCharArray[left] != sCharArray[right]) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

}
