class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character,Integer> mapOne = new HashMap<>();
        Map<Character,Integer> mapTwo = new HashMap<>();



        for(int i = 0; i < s.length(); i++){
            mapOne.put(s.charAt(i), mapOne.getOrDefault(s.charAt(i), 0) + 1);
            mapTwo.put(t.charAt(i), mapTwo.getOrDefault(t.charAt(i), 0) + 1);
        }

        return mapOne.equals(mapTwo);
    }
}
