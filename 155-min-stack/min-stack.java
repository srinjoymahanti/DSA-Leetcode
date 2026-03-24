class MinStack {
    Stack<Long> st=new Stack<>();
    long min=0;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()) {
            st.push((long)val);
            min=val;
        }
        else if(val>=min) st.push((long)val);
        else if(val<min){
            st.push(2*(long)val-min);
            min=val;
        }
    }
    
    public void pop() {
        if(st.peek()>=min){
            st.pop();
        }
        else{//fake value in the stack
            long oldMin=(2*min-st.peek());
            min=oldMin;
            st.pop();
        }
    }
    
    public int top() {
        if(st.peek()>=min) return (int)(long)st.peek();
        else return (int)min;
    }
    
    public int getMin() {
        return (int)min;
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