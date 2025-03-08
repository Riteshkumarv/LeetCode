class MyQueue {

    Stack<Integer> st; // Main stack to store elements
    Stack<Integer> temp; // Temporary stack used for reversing order

    public MyQueue() {
        st = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int x) {
        // If the main stack is empty, push the element directly
        if (st.isEmpty()) {
            st.push(x);
        } else {
            // Transfer all elements from st to temp to maintain queue order
            while (!st.isEmpty()) {
                temp.push(st.pop());
            }

            // Push the new element to st (bottom of the queue)
            st.push(x);

            // Move all elements back from temp to st
            while (!temp.isEmpty()) {
                st.push(temp.pop());
            }
        }
    }
    
    public int pop() {
        // Removes and returns the front element of the queue
        return st.pop();
    }
    
    public int peek() {
        // Returns the front element of the queue without removing it
        return st.peek();
    }
    
    public boolean empty() {
        // Checks if the queue is empty
        return st.isEmpty();
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */