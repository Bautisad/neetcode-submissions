class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for(String x : strs){
            int[] key = new int[26];

            for(char y: x.toCharArray()){
                key[y - 'a']++;
            } 

            String curKey = Arrays.toString(key);
            ans.putIfAbsent(curKey, new ArrayList<>());
            ans.get(curKey).add(x);
        }
        return new ArrayList<>(ans.values());
    }
}
