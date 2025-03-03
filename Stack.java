import java.util.Scanner;

class My_Stack {
    int[] a = new int[5]; // Initialize the stack array
    int top = -1;

    void push(int item) {
        if (top >= 4) {  // Maximum index for size 5
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
}

class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\t\tSTACK OPERATION");
        Scanner in = new Scanner(System.in);
        My_Stack ob = new My_Stack();
        int cho = 0, item;

        while (cho != 4) {
            System.out.println("1. Push ");
            System.out.println("2. Pop ");
            System.out.println("3. Peek ");
            System.out.println("4. Exit ");
            System.out.println("Enter your Choice [1,2,3,4] ....");
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
                    System.out.println("\n\n\t\t Thank you");
                    break;
                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        }
        in.close();
    }
}
