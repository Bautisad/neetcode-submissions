class Solution {
    public int[] twoSum(int[] nums, int target) {
        //value: index
        Map<Integer, Integer> ans = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int key = target - nums[i];
            if(ans.containsKey(key)){
                return new int[]{ans.get(key), i};
            } else {
                ans.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
