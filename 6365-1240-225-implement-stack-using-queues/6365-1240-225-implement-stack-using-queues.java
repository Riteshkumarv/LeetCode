import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> que; // Main queue to store elements
    private Queue<Integer> temp; // Temporary queue for reordering

    public MyStack() {
        que = new LinkedList<>(); // Initialize main queue
        temp = new LinkedList<>(); // Initialize temporary queue
    }
    
    // Push operation to insert an element in stack fashion
    public void push(int x) {

        // Move all elements from main queue to temp queue
        while (!que.isEmpty()) {
            temp.add(que.remove());
        }

        // Add the new element to the main queue
        que.add(x);

        // Move back all elements from temp queue to main queue
        while (!temp.isEmpty()) {
            que.add(temp.remove());
        }
    }
    
    // Removes and returns the top element of the stack
    public int pop() {
        return que.remove();
    }
    
    // Returns the top element without removing it
    public int top() {
        return que.peek();
    }
    
    // Checks if the stack is empty
    public boolean empty() {
        return que.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */