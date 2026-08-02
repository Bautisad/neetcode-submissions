class Solution {

    public String encode(List<String> strs) {
        StringBuilder word = new StringBuilder();

        for(String x : strs){
            word.append(x.length()).append('#').append(x);
        }
        return word.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int left = 0;
        //3#cat
        while(left < str.length()){
            int right = left;

            while(str.charAt(right) != '#'){
                right++;
            }

            int length = Integer.parseInt(str.substring(left,right));
            left = right + 1;
            right = length + left;

            ans.add(str.substring(left,right));
            left = right;
        }
            return ans;

    }
}
