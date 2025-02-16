import java.util.Scanner;

class QueueMethods {
    int arr[] = new int[5];
    int i = 0;

    public int isFull() {
        return i >= 5 ? 1 : -1;
    }

    public int isEmpty() {
        return i == 0 ? 1 : -1;
    }

    public void enqueue(int n) {
        if (isFull() == 1) {
            System.out.println("Overflow");
        } else {
            arr[i++] = n;
        }
    }

    public void dequeue() {
        if (isEmpty() == 1) {
            System.out.println("Underflow");
        } else {
            System.out.println("Deleted: " + arr[0]);
            for (int j = 0; j < i - 1; j++) {
                arr[j] = arr[j + 1];
            }
            i--;
        }
    }

    public void print() {
        for (int j = 0; j < 5; j++) {
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
