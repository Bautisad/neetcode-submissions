class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> t = new ArrayList<>();
        for(int u: nums){
            if(!t.contains(u)){
                t.add(u);
            } else {
                return true;
            }
        } return false;
    }
}
