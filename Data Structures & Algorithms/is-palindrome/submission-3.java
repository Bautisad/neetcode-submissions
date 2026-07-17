class Solution {
    public boolean isPalindrome(String s) {

        char[] sCharArray = s.toLowerCase().toCharArray();

        if(sCharArray.length < 1) return false;

        int left = 0;
        int right = s.length() - 1;

        while(left < right){    
            if(!Character.isLetterOrDigit(sCharArray[left])){
                left++;
            } else if (!Character.isLetterOrDigit(sCharArray[right])){
                right--;
            } else if (sCharArray[right] != sCharArray[left]){
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
