class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> ans = new HashMap<>();

        ans.put('}', '{');
        ans.put(')', '(');
        ans.put(']', '[');

        char[] sCharArray = s.toCharArray();
        Stack<Character> curStack = new Stack<>();

        for(int i = 0; i < sCharArray.length; i++){
            if(ans.containsKey(sCharArray[i])){
                if(!curStack.isEmpty() && ans.get(sCharArray[i]) == curStack.peek()){
                    curStack.pop();
                } else {
                    return false;
                }
            } else {
                curStack.push(sCharArray[i]);
            }
        }
        return curStack.isEmpty();
    }
}
