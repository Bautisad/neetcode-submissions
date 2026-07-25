class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> keyList = new HashMap<>();
        // Value:index
        for(int i = 0; i < nums.length; i++){
            int currentSum = target - nums[i];
            if(!keyList.containsKey(currentSum)){
                keyList.put(nums[i], i);
            } else {
                return new int[]{keyList.get(currentSum), i};
            }
        }
        return new int[]{};
    }
}
