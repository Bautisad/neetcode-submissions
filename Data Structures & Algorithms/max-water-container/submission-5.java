class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int curMax = 0;

        while (left < right){
            
            int width = right - left;
            int length = Math.min(heights[right], heights[left]);

            int curAmount = width * length;

            curMax = Math.max(curAmount, curMax);

            if(heights[left] < heights[right]){
                left++;
            } else if(heights[left] > heights[right]){
                right--;
            } else {
                left++;
                right--;
            }
        }

        return curMax;
    }
}
