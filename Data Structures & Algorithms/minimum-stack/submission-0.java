class MinStack {
    private Stack<Integer> usrStack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.usrStack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        usrStack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(usrStack.isEmpty()) return;
        int topNum = usrStack.pop();
        if(topNum == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return usrStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
