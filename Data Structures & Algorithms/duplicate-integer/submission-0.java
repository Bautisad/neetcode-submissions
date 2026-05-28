class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i + 1 == nums.length){
                return false;
            }

            if(nums[i] == nums[i + 1] ){
                return true;
            }
        }
        return false;
    }
}