package Queue;
import java.util.Scanner;

class QueueMethods {
    private int arr[];
    private int front, rear, size;

    public QueueMethods(int capacity) {
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public void enqueue(int n) {
        if (isFull()) {
            System.out.println("Queue is Full (Overflow)");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        arr[++rear] = n;
        System.out.println("Inserted: " + n);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty (Underflow)");
            return;
        }
        System.out.println("Deleted: " + arr[front++]);
        if (front > rear) {
            front = -1;
            rear = -1;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (i <= rear) {
            System.out.print(arr[i] + " ");
            i++;
        }
        // for (int i = front; i <= rear; i++) {
        //     System.out.print(arr[i] + " ");
        // } 
        System.out.println();
    }
}

public class Queue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QueueMethods ob = new QueueMethods(5);
        int choice, item;

        while (true) {
            System.out.println("\n1. Add\n2. Print\n3. Delete\n4. Exit");
            System.out.println("Enter your Choice [1,2,3,4] ....");
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
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
