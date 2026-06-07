import java.util.Stack;
public class Lc155MinStack {
        Stack<Integer> stack;
        Stack<Integer> minStack;

        public Lc155MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int value) {
            stack.push(value);

            if (minStack.isEmpty() || value <= minStack.peek()) {
                minStack.push(value);
            }
        }

        public void pop() {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }

            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }

        public static void main(String[] args) {

            Lc155MinStack minStack = new Lc155MinStack();

            minStack.push(-2);
            minStack.push(0);
            minStack.push(-3);

            System.out.println("Minimum: " + minStack.getMin());

            minStack.pop();

            System.out.println("Top Element: " + minStack.top());

            System.out.println("Minimum: " + minStack.getMin());
        }
    }
