class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(int i = 0; i < strs.length; i++){

            char[] curWord = strs[i].toCharArray();

            char[] curChar = new char[26];

            for(int j = 0; j < curWord.length; j++){
                curChar[curWord[j] - 'a']++;
            }

            String key = Arrays.toString(curChar);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(strs[i]);
        }
        return new ArrayList<>(ans.values());
    }
}
