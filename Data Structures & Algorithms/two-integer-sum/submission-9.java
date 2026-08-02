class Solution {
    public int[] twoSum(int[] nums, int target) {
        //value:index
        Map<Integer, Integer> ans = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int sum = target - nums[i];
            if(ans.containsKey(sum)){
                return new int[]{ans.get(sum), i};
            } else {
                ans.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
