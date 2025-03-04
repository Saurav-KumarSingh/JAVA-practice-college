import java.util.Scanner;

class QueueMethods {
    int arr[] = new int[5];
    int front = 0,rear=-1;

    public int isFull() {
        return rear >= 4 ? 1 : -1;
    }

    public int isEmpty() {
        return rear == -1 ? 1 : -1;
    }

    public void enqueue(int n) {
        if (isFull() == 1) {
            System.out.println("Overflow");
        } else {
            arr[++rear] = n;
        }
    }

    public void dequeue() {
        if (isEmpty() == 1) {
            System.out.println("Underflow");
        } else {
            System.out.println("Deleted: " + arr[front++]);
            
        }
    }

    public void print() {
        for (int j = front; j <5; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}

public class Queue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QueueMethods ob = new QueueMethods();
        int choice, item;

        while (true) {
            System.out.println("1. Add\n2. Print\n3. Delete\n4. Exit\n");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter no.");
                    item = in.nextInt();
                    ob.enqueue(item);
                    break;
                case 2:
                    ob.print();
                    break;
                case 3:
                    ob.dequeue();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
