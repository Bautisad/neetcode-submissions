class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> newSet = new HashSet<>();
        for (int p : nums){
           if(newSet.contains(p)) {
            return true;
           }
           newSet.add(p);
        }
        return false;
    }
}
