package stackPackage;

public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if(top == maxSize - 1) {
            System.out.println("Stack is full. Can't push " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    public void pop() {
        if(top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Popped " + stackArray[top--]);
        }
    }

    public void display() {
        if(top == -1) {
            System.out.println("Stack is empty.");
        } else {import stackPackage.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        stack.display();

        // Pop elements from the stack
        stack.pop();
        
        // Display the stack again
        stack.display();
    }
}
javac -d . Stack.java
javac -d . Main.java
java Main


            System.out.println("Stack elements are:");
            for(int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }
}





