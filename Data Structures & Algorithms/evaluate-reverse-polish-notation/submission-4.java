class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> userStack = new Stack<>();

        for(String x : tokens){
            if(x.equals("+")){
                userStack.push(userStack.pop() + userStack.pop());
            } else if(x.equals("*")){
                userStack.push(userStack.pop() * userStack.pop());
            } else if(x.equals("/")){
                int first = userStack.pop();
                int sec = userStack.pop();
                userStack.push(sec / first);
            } else if(x.equals("-")){
                int first = userStack.pop();
                int sec = userStack.pop();
                userStack.push(sec - first);
            } else {
                userStack.push(Integer.parseInt(x));
            }
        }
        return userStack.pop();
    }
}
