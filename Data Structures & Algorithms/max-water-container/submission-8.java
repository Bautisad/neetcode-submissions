class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int maxAmount = 0;

        while(left < right){
            int length = right - left;
            int width = Math.min(heights[left], heights[right]);

            int curAmount = length * width;
            maxAmount = Math.max(curAmount, maxAmount);

            if(heights[left] < heights[right]){
                left++;
            } else if(heights[left] > heights[right]){
                right--;
            } else {
                left++;
                right--;
            }
        }
        return maxAmount;
    }
}
