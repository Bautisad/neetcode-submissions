class Solution {
    public boolean isPalindrome(String s) {

        char[] sCharArray = s.toLowerCase().toCharArray();

        int left = 0, right = sCharArray.length - 1;

        while(left < right){
            if(!Character.isLetterOrDigit(sCharArray[left])){
                left++;
            } else if (!Character.isLetterOrDigit(sCharArray[right])){
                right--;
            } else if( sCharArray[left] != sCharArray[right] ){
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
