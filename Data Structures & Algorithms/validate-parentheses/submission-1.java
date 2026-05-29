class Solution {
    public boolean isValid(String s) {
        char[] sCharArray = s.toCharArray();
        ArrayDeque<Character> currentStack = new ArrayDeque<>();
        Map<Character,Character> currentHash = new HashMap<>();

        currentHash.put('}', '{');
        currentHash.put(')', '(');
        currentHash.put(']', '[');

        for(int i = 0; i < sCharArray.length; i++){
            if(currentHash.containsKey(sCharArray[i])){
                if(!currentStack.isEmpty() && currentStack.peek() == currentHash.get(sCharArray[i])){
                    currentStack.pop();
                } else {
                    return false;
                }
            } else {
                currentStack.push(sCharArray[i]);
            }
        }
        return currentStack.isEmpty();
    }
}
