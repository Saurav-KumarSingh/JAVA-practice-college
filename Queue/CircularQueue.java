package Queue;
import java.util.Scanner;

class CircularQueueMethods {
    private int arr[];
    private int front, rear, size;

    public CircularQueueMethods(int capacity) {
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = capacity;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public boolean isEmpty() {
        return front == -1 && front == -1;
    }

    public void enqueue(int n) {
        if (isFull()) {
            System.out.println("Queue is Full (Overflow)");
            return;
        }
        if (isEmpty()) {
            front = 0;
        } 
        rear = (rear + 1) % size;
        arr[rear] = n;
        System.out.println("Inserted: " + n);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty (Underflow)");
            return;
        }
        System.out.println("Deleted: " + arr[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CircularQueueMethods ob = new CircularQueueMethods(5);
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
