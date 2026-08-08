class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int x : nums){
            if(numSet.contains(x)){
                return true;
            } else {
                numSet.add(x);
            }
        }
        return false;
    }
}