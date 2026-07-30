class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> ans = new HashMap<>();

        ans.put(')', '(');
        ans.put(']', '[');
        ans.put('}', '{');

        Stack<Character> sStack = new Stack<>();

        for(char x : s.toCharArray()){
            if(ans.containsKey(x)){
                if(!sStack.isEmpty() &&sStack.peek() == ans.get(x)){
                    sStack.pop();
                } else {
                    return false;
                }

            } else {
                sStack.push(x);
            }
        }
        return sStack.isEmpty();
    }
}
