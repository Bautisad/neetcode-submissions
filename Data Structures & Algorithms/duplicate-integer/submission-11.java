class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> numsSet = new HashSet<>();

       for(int x : nums){
        if(numsSet.contains(x)){
            return true;
        } else {
            numsSet.add(x);
        }
       }
       return false;
    }
}