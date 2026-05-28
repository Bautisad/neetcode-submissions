class Solution {
    public boolean isPalindrome(String s) {
        char[] word = s.toLowerCase().toCharArray();
        int left = 0;
        int right = word.length - 1;

        while(right > left){

            if(!Character.isLetterOrDigit(word[left])){
                left++;
                continue;
            } else if(!Character.isLetterOrDigit(word[right])){
                right--;
                continue;
            }

            if(word[left] != word[right]){
                return false;
            } else {
                left++;
                right--;
            }

        }

        return true;
    }
}
