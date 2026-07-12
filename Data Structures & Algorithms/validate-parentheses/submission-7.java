class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> keyList = new HashMap<>();

        keyList.put('}', '{');
        keyList.put(']', '[');
        keyList.put(')', '(');

        char[] sCharArray = s.toCharArray();

        if(sCharArray.length < 2) return false;

        Stack<Character> curStack = new Stack<>();

        for(int i = 0; i < sCharArray.length; i++){
            if(keyList.containsKey(sCharArray[i])){
                if(!curStack.isEmpty() && curStack.peek() == keyList.get(sCharArray[i])){
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
