class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> output = new HashMap();
        for(String s : strs){
            char[] unorganized = s.toCharArray();
            Arrays.sort(unorganized);
            String organized = new String(unorganized);
            output.putIfAbsent(organized, new ArrayList<>());
            output.get(organized).add(s);
        }
        return new ArrayList<>(output.values());
    }
}
