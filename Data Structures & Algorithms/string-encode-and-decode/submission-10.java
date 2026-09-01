class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        //3#cat
        for(String x : strs){
            ans.append(x.length());
            ans.append('#');
            ans.append(x);
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

            int wordLength = Integer.parseInt(str.substring(left, right));
            left = right + 1;
            right = left + wordLength;
            ans.add(str.substring(left,right));
            left = right;
        }
        return ans;

    }
}
