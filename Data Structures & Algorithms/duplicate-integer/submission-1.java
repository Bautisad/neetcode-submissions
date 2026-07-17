class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> keyList = new HashSet<>(nums.length);

        for(int i =0; i < nums.length; i++){
            if(keyList.contains(nums[i])){
                return true;
            } else {
                keyList.add(nums[i]);
            }
        }
        return false;
    }
}