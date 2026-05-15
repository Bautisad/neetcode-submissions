
class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList t = new ArrayList<>();
        for(int x : nums){
            if(t.contains(x)) return true;
            t.add(x);
        } return false;
    }
}
