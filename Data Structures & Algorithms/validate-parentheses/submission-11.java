class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> ans = new HashMap<>();

        ans.put('}', '{');
        ans.put(')', '(');
        ans.put(']', '[');

        Stack<Character> answer = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(ans.containsKey(s.charAt(i))){
                if(!answer.isEmpty() && answer.peek() == ans.get(s.charAt(i))){
                    answer.pop();
                } else {
                    return false;
                }
            } else {
                answer.push(s.charAt(i));
            }
        }
        return answer.isEmpty();
    }
}
