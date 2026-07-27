class MinStack {
    private Stack<Integer> userStack;
    private Stack<Integer> minStack;

    public MinStack() {
        userStack = new Stack<>();
        minStack = new Stack<>();    
    }
    
    public void push(int val) {
        userStack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(userStack.isEmpty()) return;
        int topNumber = userStack.pop();
        if(minStack.peek() == topNumber){
            minStack.pop();
        }
    }
    
    public int top() {
        return userStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
