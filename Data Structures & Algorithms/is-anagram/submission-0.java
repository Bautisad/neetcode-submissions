class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sCharArray = s.toLowerCase().toCharArray();
        char[] tCharArray = t.toLowerCase().toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        if(sCharArray.length != tCharArray.length) return false;

        for(int i = 0; i < sCharArray.length; i++){
            if(sCharArray[i] != tCharArray[i]) return false;
        }
        return true;
    }
}
