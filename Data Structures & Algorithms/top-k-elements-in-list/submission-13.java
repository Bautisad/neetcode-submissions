class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> ans = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }

        for(int i = 0; i < nums.length; i++){
            ans.put(nums[i], ans.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry <Integer, Integer> entry : ans.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] ansKey = new int[k];
        int index = 0;
        for(int i = freq.length - 1; i > 0 && index < k; i--){
            for(int x : freq[i]){
                ansKey[index++] = x;
                if(index ==k) return ansKey;
            }
        }
        return ansKey;
    }
}
