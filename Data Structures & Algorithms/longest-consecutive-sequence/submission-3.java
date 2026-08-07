class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int x : nums){
            numSet.add(x);
        }

        int longest = 0;
        for(int x : nums){
            if(!numSet.contains( x - 1)){
                int length = 1;
                while(numSet.contains(x + length)){
                    length++;
                }
                longest = Math.max(longest, length);
            }
            
        }
        return longest;
    }
}
