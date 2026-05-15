class Solution {
    public int[] productExceptSelf(int[] nums) {
        int index = nums.length;
        int[] prefix = new int[index];
        int[] postfix = new int[index];
        int[] ans = new int[index];

        for(int i = 0; i < index; i++){
            if(i == 0){
                prefix[i] = nums[i] * 1;
            } else {
                prefix[i] = nums[i] * prefix[i - 1];
            }
        }

        for(int i = index - 1; i > -1; i--){
            if(i == index - 1){
                postfix[i] = nums[i] * 1;
            } else {
                postfix[i] = nums[i] * postfix[i + 1];
            }
        }

        for(int i = 0; i < index; i++){
            if(i == 0){
                ans[i] = postfix[i + 1] * 1;
            } else if(i == index - 1){
                ans[i] = prefix[i - 1] * 1;
            } else {
                ans[i] = postfix[i + 1] * prefix[i - 1];
            }
        }
        return ans;
    }
}  
