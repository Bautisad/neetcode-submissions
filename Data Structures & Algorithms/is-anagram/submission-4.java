class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> keyListOne = new HashMap<>();
        Map<Character, Integer> keyListTwo = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i ++){
            keyListOne.put(s.charAt(i), keyListOne.getOrDefault(s.charAt(i), 0) + 1);
            keyListTwo.put(t.charAt(i), keyListTwo.getOrDefault(t.charAt(i), 0) + 1);
        }

        return keyListOne.equals(keyListTwo);
    }
}
