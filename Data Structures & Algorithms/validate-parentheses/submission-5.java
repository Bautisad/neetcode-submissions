class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> keyList = new HashMap<>();

        keyList.put('}', '{');
        keyList.put(']', '[');
        keyList.put(')', '(');

        Stack<Character> currStack = new Stack<>();

        for(Character currChar : s.toCharArray()){
            if(keyList.containsKey(currChar)){
                if(!currStack.isEmpty() && currStack.peek() == keyList.get(currChar)){
                    currStack.pop();
                } else {
                    return false;
                }
            } else {
                currStack.push(currChar);
            }
        }
        return currStack.isEmpty();
    }
}
