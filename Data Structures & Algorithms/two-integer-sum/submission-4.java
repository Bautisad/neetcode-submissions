class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        Map<Integer, Integer> ans = new HashMap<>();
        //value:index
        //target - nums[i]
        //if not in hashMap - put in hashmap else return new int[]

        for(int i = 0; i < nums.length; i++){
            int curSum = target - nums[i];

            if(ans.containsKey(curSum)){
                return new int[]{ans.get(curSum), i};
            } else {
                ans.put(nums[i], i);
            }
        }

        return new int[]{};

    }
}
