class Solution {
    public void reverseString(char[] s) {
        char[] ans = new char[s.length];
        int counter = 1;
        for(int i = 0; i < s.length; i++){
            for(int j = s.length - counter; j > i; j--){
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                break;
            }
            counter++;
        }
        
    }
}