class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] wordChar = strs[i].toCharArray();

            int[] letter = new int[26];

            for(char x : wordChar){
                letter[x - 'a']++;
            }

            String key = Arrays.toString(letter);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(strs[i]);
        }

        return new ArrayList<>(ans.values());
    }
}
