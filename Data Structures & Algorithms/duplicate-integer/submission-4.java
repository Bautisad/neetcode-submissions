class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i+1 != nums.length){
                if(nums[i + 1] == nums[i]){
                    return true;
                }
            }
        }
        return false;
    }
}