class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> keyList = new HashMap<>();

        keyList.put(')','(');
        keyList.put(']','[');
        keyList.put('}','{');

        Stack<Character> stack = new Stack<>();

        for(char curChar : s.toCharArray()){
            if(keyList.containsKey(curChar)){
                if(!stack.isEmpty() && stack.peek() == keyList.get(curChar)){
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
