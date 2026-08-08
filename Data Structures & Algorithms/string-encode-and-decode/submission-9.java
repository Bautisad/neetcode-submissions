class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for(String x : strs){
            ans.append(x.length()).append("#").append(x);
        }
        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        //3#cat
        int left = 0;
        while(left < str.length()){
            int right = left;
            while(str.charAt(right) != '#'){
                right++;
            }

            int length = Integer.parseInt(str.substring(left, right));
            left = right + 1;
            right = left + length;
            String curWord = str.substring(left, right);
            ans.add(curWord);
            left = right;
        }
        return ans;
    }
}
