class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> count = new HashMap<>();

        for(int i =0; i < strs.length;i++){

            char[] curWord = strs[i].toCharArray();

            int[] letters = new int[26];

            for(char x : curWord){
                letters[x - 'a']++;
            }

            String key = Arrays.toString(letters);

            count.putIfAbsent(key, new ArrayList<>());
            count.get(key).add(strs[i]);
        }

        return new ArrayList<>(count.values());

    }
}
