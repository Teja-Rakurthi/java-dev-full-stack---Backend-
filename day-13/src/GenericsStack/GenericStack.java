package src.GenericsStack;

class GenericStack<T> {
    private T[] stack;
    private int top;

    @SuppressWarnings("unchecked")
    GenericStack(int size) {
        stack = (T[]) new Object[size];
        top = -1;
    }

    void push(T item) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=item;
    }

    T pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return null;
        }
        return stack[top--];
    }

    T peek(){
        if(top==-1) return null;
        return stack[top];
    }

    boolean isEmpty(){
        return top==-1;
    }
}