class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> keyList = new HashMap<>();

        for(int i =0; i < nums.length; i++){
            int sum = target - nums[i];

            if(keyList.containsKey(sum)){
                return new int[]{keyList.get(sum),i};
            } else {
                keyList.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
