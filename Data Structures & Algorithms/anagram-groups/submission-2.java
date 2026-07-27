class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(int i = 0; i < strs.length; i++){

            char[] curWord = strs[i].toCharArray();

            int[] charWord = new int[26];

            for(int j = 0; j < curWord.length; j++){
                charWord[curWord[j] - 'a']++;
            }

            String key = Arrays.toString(charWord);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(strs[i]);
        }

        return new ArrayList<>(ans.values());
    }
}
