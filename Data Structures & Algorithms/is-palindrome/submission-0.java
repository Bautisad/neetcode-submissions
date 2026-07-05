class Solution {
    public boolean isPalindrome(String s) {
        //case sensitive
        //ignote all non alphanumeric 

        char[] sArray = s.toLowerCase().toCharArray();
        if(sArray.length < 1) return false;
        int left = 0, right = sArray.length - 1;

        while(left < right){
            if(!Character.isLetterOrDigit(sArray[left])){
                left++;
                continue;
            } else if(!Character.isLetterOrDigit(sArray[right])){
                right--;
                continue;
            }

            if(sArray[left] != sArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
