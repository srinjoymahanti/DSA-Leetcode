class MinStack {
    Stack<Long> st=new Stack<>();
    long min=0;
    public MinStack() {
        
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            st.push((long)value);
            min=value;
        }
        else if(value<min){
            long val=2*(long)value-min;
            st.push(val);
            min=value;
        }
        else st.push((long)value);
    }
    
    public void pop() {
        if(st.peek()<min){
            long oldMin=2*min-st.peek();
            min=oldMin;
            st.pop();
        }
        else st.pop();
    }
    
    public int top() {
        if(st.peek()<min) return (int)min;
        else return (int)(long)st.peek();
    }
    
    public int getMin() {
        return (int)min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */