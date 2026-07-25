class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> keyList = new HashSet<>();

        for(int x : nums){
            if(keyList.contains(x)){
                return true;
            } else {
                keyList.add(x);
            }
        }
        return false;
    }
}