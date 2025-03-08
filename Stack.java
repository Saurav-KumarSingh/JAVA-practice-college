import java.util.Scanner;

class My_Stack {
    int[] a; // Initialize the stack array
    int top = -1;

    // Constructor to set the size of the stack
    My_Stack(int size) {
        a = new int[size];
    }

    void push(int item) {
        if (top >= a.length - 1) {
            System.out.println("OverFlow..");
            return;
        }
        a[++top] = item;
    }

    int pop() {
        if (top == -1) {
            System.out.println("UnderFlow..");
            return -1;
        }
        return a[top--];
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element: " + a[top]);
    }

    void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements (Top to Bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

class Stack {
    public static void main(String[] args) {
        System.out.println("\n\n\t\tSTACK OPERATION");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the stack:");
        int size = in.nextInt();
        My_Stack ob = new My_Stack(size);

        int cho = 0, item;

        while (cho != 5) {
            System.out.println("---------------menu-----------------");
            System.out.println("1. Push ");
            System.out.println("2. Pop ");
            System.out.println("3. Peek ");
            System.out.println("4. Print Stack ");
            System.out.println("5. Exit ");
            System.out.println("---------------menu-----------------\n");
            System.out.println("Enter your Choice [1,2,3,4,5] ....");
            cho = in.nextInt();

            switch (cho) {
                case 1:
                    System.out.println("Enter new item ");
                    item = in.nextInt();
                    ob.push(item);
                    break;
                case 2:
                    int t = ob.pop();
                    if (t != -1) {
                        System.out.println("Popped element is " + t);
                    }
                    break;
                case 3:
                    ob.peek();
                    break;
                case 4:
                    ob.printStack();
                    break;
                case 5:
                    System.out.println("\n\n\t\t Thank you");
                    break;
                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        }
        in.close();
    }
}
