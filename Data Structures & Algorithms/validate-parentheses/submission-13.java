class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> keyList = new HashMap<>();
        Stack<Character> userStack = new Stack<>();

        keyList.put('}', '{');
        keyList.put(')', '(');
        keyList.put(']', '[');

        for(char x : s.toLowerCase().toCharArray()){
            if(keyList.containsKey(x)){
                if(!userStack.isEmpty() && userStack.peek() == keyList.get(x)){
                    userStack.pop();
                } else {
                    return false;
                }
            } else {
                userStack.push(x);
            }
        }
        return userStack.isEmpty();
    }
}
