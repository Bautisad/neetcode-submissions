class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> keyList = new HashMap<>();

        keyList.put('}', '{');
        keyList.put(']', '[');
        keyList.put(')', '(');

        Stack<Character> curStack = new Stack<>();

        for(char x : s.toLowerCase().toCharArray()){
            if(keyList.containsKey(x)){
                if(!curStack.isEmpty() && curStack.peek() == keyList.get(x)){
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
