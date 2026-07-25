class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> keyList = new HashMap<>();

        keyList.put('}', '{');
        keyList.put(')', '(');
        keyList.put(']', '[');

        Stack<Character> usedStack = new Stack<>();

        for(Character x : s.toCharArray()){
            if(!usedStack.isEmpty() && keyList.containsKey(x) && keyList.get(x) == usedStack.peek()){
                usedStack.pop();
            } else {
                usedStack.push(x);
            }
        }

        return usedStack.isEmpty();
    }
}
