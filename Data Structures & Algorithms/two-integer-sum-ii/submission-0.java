class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while(left < right){
            int totalSum = numbers[left] + numbers[right];
            if(totalSum == target && left < right){
                return new int[]{left + 1,right + 1};
            } else if(totalSum < target){
                left++;
                continue;
            } else if(totalSum > target){
                right--;
                continue;
            } 

            left++;
            right--;
        }
        return new int[]{};
    }
}
