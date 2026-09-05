class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int x : nums){
            if(ans.contains(x)){
                return true;
            } else {
                ans.add(x);
            }
        }
        return false;
    }
}