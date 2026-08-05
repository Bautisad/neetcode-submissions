class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(int i = 0;i < strs.length; i++){
            int[] letters = new int[26];

            for(char x : strs[i].toCharArray()){
                letters[x - 'a']++;
            }

            String key = Arrays.toString(letters);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(strs[i]);
        }
        return new ArrayList<>(ans.values());
    }
}
