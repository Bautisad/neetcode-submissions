class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> keyList = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int curSum = target - nums[i];
            if(!keyList.containsKey(curSum)){
                keyList.put(nums[i], i);
            } else {
                return new int[]{keyList.get(curSum), i};
            }
        }
        return new int[]{};
    }
}
