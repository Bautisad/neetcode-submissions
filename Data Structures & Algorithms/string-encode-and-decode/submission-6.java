class Solution {

    public String encode(List<String> strs) {
        StringBuilder newString = new StringBuilder();

        for(String x : strs){
            newString.append(x.length()).append('#').append(x);
        }

        return newString.toString();
    }

    public List<String> decode(String str) {
        //3#cat

        List<String> ans = new ArrayList<>();

        int left = 0;
        while(left < str.length()){
            int right = left;

            while(str.charAt(right) != '#'){
                right++;
            }
        int length = Integer.parseInt(str.substring(left,right));

        left = right + 1;
        right = left + length;

        ans.add(str.substring(left,right));

        left = right;

        }
        return ans;
    }
}
