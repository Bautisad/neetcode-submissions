class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> dict = new HashSet<>();

        for(int x : nums){
            dict.add(x);
        }

        int longestSequence = 0;
        for(int x : nums){
            if(!dict.contains(x - 1)){
                int length = 1;
                while(dict.contains(x + length)){
                    length++;
                }
                longestSequence = Math.max(longestSequence, length);
            }
        }
        return longestSequence;
    }
}
