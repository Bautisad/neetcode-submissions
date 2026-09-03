class MinStack {
    Stack<Integer> userStack;
    Stack<Integer> minStack;


    public MinStack() {
        this.userStack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        userStack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(userStack.isEmpty()) return;
        int top = userStack.pop();
        if(top == minStack.peek()){
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
