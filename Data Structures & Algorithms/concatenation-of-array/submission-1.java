class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int counter = 0;
        for(int i = 0; i < ans.length; i++){
            if(counter == nums.length){
                counter = 0;
            }
            ans[i] = nums[counter];
            counter++;
        }
        return ans;
    }
}