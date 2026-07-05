class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> ans = new HashMap<>();
        ans.put('}', '{');
        ans.put(')', '(');
        ans.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for(char curChar : s.toCharArray()){
            if(ans.containsKey(curChar)){
                if(!stack.isEmpty() && stack.peek() == ans.get(curChar)){
                    stack.pop();
                } else {    
                    return false;
                }
            } else {
                stack.push(curChar);
            }
        }

        return stack.isEmpty();
    }
}
