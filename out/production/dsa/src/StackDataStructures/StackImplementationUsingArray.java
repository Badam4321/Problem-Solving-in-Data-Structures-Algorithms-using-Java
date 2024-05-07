package StackDataStructures;
class Stack{
    int size;
    int top;
    int[] arr;
    public Stack(int size ,int top ){
        this.size = size;
        this.top = top;
        arr = new int[size];
    }

    public void push(int element) {
        top++;
        arr[top] = element;
    }

    public int pop() {
        int x = arr[top];
        top--;
        return x;
    }

    public int top() {
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
public class StackImplementationUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack(10000,-1);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.size());
        System.out.println(st.isEmpty());

    }
}
/*
Implement a stack using an array
Stack is a lenear data structure which works on the principle of LIFO(ListINFirstOut)
Major operation on the stack:
1)push(x)-->insert an element in the stack
2)pop()--> Remove and return the topmost element of Stack
3)top() --> returns topmost element of the stack
4)size()--> returns the numnber of remaining elements in the stack
5)isEmpty()--> returns true if the stack is empty else false.
 */
