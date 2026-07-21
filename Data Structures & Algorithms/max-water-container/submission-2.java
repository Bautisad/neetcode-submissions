class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;

        int maxArea = 0;

        while(left < right){
            int height = right - left;
            int width = Math.min(heights[left], heights[right]);

            int currentArea = height * width;

            maxArea = Math.max(maxArea,currentArea);

            if(heights[left] < heights[right] ){
                left++;
            } else if (heights[left] > heights[right]){
                right--;
            }else {
                left++;
                right--;
            }
        }
        return maxArea;
    }
}
