class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int maxArea = 0;

        while(left < right){
            int length = right - left;
            int width = Math.min(heights[right], heights[left]);

            int curArea = length * width;
            maxArea = Math.max(curArea, maxArea);

            if(heights[left] < heights[right]){
                left++;
            } else if(heights[left] > heights[right]){
                right--;
            } else {
                left++;
                right--;
            }
        }
        return maxArea;
    }
}
