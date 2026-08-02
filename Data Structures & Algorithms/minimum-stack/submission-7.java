class MinStack {
    private Stack<Integer> minStack;
    private Stack<Integer> curStack;

    public MinStack() {
        minStack = new Stack<>();
        curStack = new Stack<>();
    }
    
    public void push(int val) {
        curStack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(curStack.isEmpty()) return;
        int top = curStack.pop();
        if(top == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return curStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
