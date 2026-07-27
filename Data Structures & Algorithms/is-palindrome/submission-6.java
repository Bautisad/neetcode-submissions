class Solution {
    public boolean isPalindrome(String s) {

        char[] sChar = s.toLowerCase().toCharArray();
        int left = 0;
        int right = sChar.length - 1;

        while(left < right){

            if(!Character.isLetterOrDigit(sChar[left])){
                left++;
            } else if(!Character.isLetterOrDigit(sChar[right])){
                right--;
            } else if(sChar[left] != sChar[right]){
                return false;
            } else {
                left++;
                right--;
            }

        }

        return true;
    }
}
