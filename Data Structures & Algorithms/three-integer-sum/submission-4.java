class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            int left = i + 1, right = nums.length - 1;
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            while(left < right){
                int currSum = nums[i] + nums[left] + nums[right];
                if(currSum == 0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left -1]){
                        left++;
                    }

                }else if(currSum > 0){
                    right--;
                } else if (currSum < 0){
                    left++;
                }
            }
        }
        return ans;
    }
}
