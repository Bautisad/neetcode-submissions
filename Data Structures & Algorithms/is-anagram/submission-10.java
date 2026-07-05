class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for(int i = 0; i < sArray.length; i++){

            if (sArray.length != tArray.length){
                return false;
            }

            if(sArray[i] != tArray[i]){
                return false;
            } else {
                continue;
            }
        }
        return true;
    }
}
