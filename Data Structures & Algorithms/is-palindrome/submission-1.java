class Solution {
    public boolean isPalindrome(String s) {
        char[] sArray = s.toLowerCase().toCharArray();

        int left = 0, right = sArray.length - 1;

        while(left < right){
            if(!Character.isLetterOrDigit(sArray[left])){
                left++;
            } else if(!Character.isLetterOrDigit(sArray[right])) {
                right--;
            } else if(sArray[left] != sArray[right]){
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
