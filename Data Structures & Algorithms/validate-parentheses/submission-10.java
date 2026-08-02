class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> ans = new HashMap<>();

        ans.put('}',  '{');
        ans.put(']' , '[');
        ans.put(')' , '(');

        Stack<Character> curStack = new Stack<>();

        for(char x : s.toCharArray()){
            if(ans.containsKey(x)){
                if(!curStack.isEmpty() && curStack.peek() == ans.get(x)){
                    curStack.pop();
                } else {
                    return false;
                }
            } else {
                curStack.push(x);
            }
        }
        return curStack.isEmpty();
    }
}
