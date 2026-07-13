class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;

        int maxArea = 0;

        while(left < right){
            int length = right - left;
            int height = Math.min(heights[left], heights[right]);

            int curArea = length * height;

            maxArea = Math.max(curArea, maxArea);

            if(heights[left] < heights[right]){
                left++;
            } else if (heights[left] > heights[right]){
                right--;
            } else {
                left++;
                right--;
            }

        }
        return maxArea;
    }
}
