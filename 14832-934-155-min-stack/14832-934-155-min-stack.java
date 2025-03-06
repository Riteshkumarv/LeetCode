import java.util.Stack;

class MinStack {

    private Stack<Integer> st;  // Main stack to store elements
    private Stack<Integer> min; // Auxiliary stack to store minimum values

    public MinStack() {
        // Initialize both stacks
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        // Push the value onto the main stack
        st.push(val);
        
        // If the min stack is empty or the new value is smaller than or equal to the current minimum,
        // push it onto the min stack
        if (min.isEmpty() || min.peek() >= val) {
            min.push(val);
        }
    }
    
    public void pop() {
        // If the top of the main stack is equal to the top of the min stack,
        // remove it from the min stack as well
        if (st.peek().equals(min.peek())) {
            min.pop();
        }

        // Remove the top element from the main stack
        st.pop();
    }
    
    public int top() {
        // Return the top element of the main stack
        return st.peek();
    }
    
    public int getMin() {
        // Return the top element of the min stack, which is the minimum value
        return min.peek();
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