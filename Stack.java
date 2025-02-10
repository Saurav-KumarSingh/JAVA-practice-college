import java.util.Scanner;

class My_Stack {
    int[] a; // Stack array
    int i = 0, j;
    
    // Constructor to initialize the stack
    My_Stack() {
        a = new int[5]; // Fixed size stack
    }

    public void push(int item) {
        if (i >= 5) {
            System.out.println("OverFlow..");
            return; // Exit Push
        }
        a[i++] = item; // Push success
    }

    public void peek() {
        if (i == 0) {
            System.out.println("Stack is Empty!");
            return;
        }
        for (j = 0; j < i; j++)
            System.out.println(a[j]);
    }

    public int pop() {
        if (i <= 0) {
            System.out.println("UnderFlow");
            return -1; // To Tell, operation Failed
        }
        return a[--i]; // Return popped value
    }
}

class Stack {
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

            if (cho == 1) {
                System.out.println("Enter new item ");
                item = in.nextInt();
                ob.push(item);
            } else if (cho == 2) {
                int t = ob.pop();
                if (t != -1) {
                    System.out.println("Popped element is " + t);
                }
            } else if (cho == 3) {
                ob.peek();
            } else if (cho == 4) {
                break;
            } else {
                System.out.println("Invalid Choice! Try again.");
            }
        }

        System.out.println("\n\n\t\t Thank you");
        in.close();
    }
}
