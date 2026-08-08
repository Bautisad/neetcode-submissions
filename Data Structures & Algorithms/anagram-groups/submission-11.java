class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] wordCHar = strs[i].toLowerCase().toCharArray();

            int[] letter = new int[26];
            for(char x : wordCHar){
                letter[x - 'a']++;
            }

            String key = Arrays.toString(letter);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(strs[i]);
        }
        return new ArrayList<>(ans.values());
    }
}
