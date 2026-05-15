class Solution {
    public int[] twoSum(int[] nums, int target) {
            int[] intSum = new int[2];
            for(int i = 0; i < nums.length; i++){
                int firstNum = nums[i];
                for(int j = 0; j < nums.length; j++){
                    int secondNum = nums[j];
                    if(firstNum + secondNum == target) {
                        intSum[0] = j;
                        intSum[1] = i;
                        break;
                    }
                }
            } return intSum;
    }
}
