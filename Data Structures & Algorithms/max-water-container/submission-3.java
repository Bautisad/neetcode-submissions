class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length - 1;

        int maximumAmount = 0;

        while(left < right){
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;

            int curAmount = height * width;

            maximumAmount = Math.max(curAmount, maximumAmount);

            if(heights[left] < heights[right]){
                left++;
            } else if(heights[left] > heights[right]){
                right--;
            } else{
                left++;
                right--;
            }
        }

        return maximumAmount;

    }
}
