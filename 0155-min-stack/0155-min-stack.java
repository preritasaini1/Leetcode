class MinStack {

    private class StackData{
        int data;
        int min;
    }

    Stack<StackData> s = new Stack<StackData>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        StackData obj = new StackData();
        obj.data = val;
        if(s.isEmpty()){
            obj.min = val;
        }
        else{
            obj.min = s.peek().min >= val ? val : s.peek().min;
        }
        s.push(obj);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek().data;
    }
    
    public int getMin() {
        return s.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */