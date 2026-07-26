class Solution {
    public int[] twoSum(int[] nums, int target) {
        //value : index
        Map<Integer,Integer> keyList = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int curSum = target - nums[i];
            if(keyList.containsKey(curSum)){
                return new int[]{keyList.get(curSum), i};
            } else {
            keyList.put(nums[i], i);
            }

        }
        return new int[]{};
    }
}
