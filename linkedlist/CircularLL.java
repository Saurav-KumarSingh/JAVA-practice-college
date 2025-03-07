package linkedlist;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head = null;
    Node tail = null;
    int size = 0; // Track size of the list

    void insertAtEnd(int value) {
        Node new_Node = new Node(value);
        if (head == null) { // First node case
            head = new_Node;
            tail = new_Node;
            new_Node.next = head;
        } else {
            tail.next = new_Node;
            tail = new_Node;
            tail.next = head;//circular link
        }
        size++; // Increase size
    }

    void insertAtBeginning(int value) {
        Node new_Node = new Node(value);
        if (head == null) {
            head = new_Node;
            tail = new_Node;
            tail.next = head;//circular link
        } else {
            new_Node.next = head;
            head = new_Node;
            tail.next = head;//circular link
        }
        size++;
    }

    void insertAtPosition(int position, int value) {
        if (position < 0 || position > size) {
            System.out.println("Invalid Position...");
            return;
        }
        if (position == 0) {
            insertAtBeginning(value);
            return;
        }
        if (position == size) {
            insertAtEnd(value);
            return;
        }

        Node new_Node = new Node(value);
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        new_Node.next = temp.next;
        temp.next = new_Node;
        size++;
    }

    void showList() {
        if (head == null) {
            System.out.println("List is Empty...");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Circular)");
    }

    int getAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid position...");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    int deleteAtBeginning() {
        if (head == null) {
            System.out.println("Empty list");
            return -1;
        }
        int data = head.data;
        if (head == tail) { // Single node case
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--; // Decrease size
        return data;
    }

    int deleteAtEnd() {
        if (head == null) {
            System.out.println("Empty list");
            return -1;
        }
        int data = tail.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
        size--;
        return data;
    }

    int deleteAtPosition(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid Position...");
            return -1;
        }
        if (position == 0) {
            return deleteAtBeginning();
        }
        if (position == size - 1) {
            return deleteAtEnd();
        }

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        Node deletedNode = temp.next;
        temp.next = temp.next.next;
        size--;
        return deletedNode.data;
    }
}

public class CircularLL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CircularLinkedList cll = new CircularLinkedList();
        System.out.println("Circular Linked List Operations:\n");

        while (true) {
            System.out.println("\n-------------------Menu---------------------------\n");
            System.out.println(
                    "1. Insert at End\n2. Insert at Beginning\n3. Insert at Position\n4. Print\n5. List Size\n6. Get Node At\n7. Delete at Beginning\n8. Delete at End\n9. Delete at Position\n10. Exit");
            System.out.println("\n--------------------------------------------------\n");
            System.out.print("Enter Choice: ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    int value = in.nextInt();
                    cll.insertAtEnd(value);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    value = in.nextInt();
                    cll.insertAtBeginning(value);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    value = in.nextInt();
                    System.out.print("Enter position: ");
                    int position = in.nextInt();
                    cll.insertAtPosition(position, value);
                    break;
                case 4:
                    System.out.println("List: ");
                    cll.showList();
                    break;
                case 5:
                    System.out.println("List Size: " + cll.size);
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    position = in.nextInt();
                    System.out.println("Node data At: " + cll.getAt(position));
                    break;
                case 7:
                    System.out.println("Deleted: " + cll.deleteAtBeginning());
                    break;
                case 8:
                    System.out.println("Deleted: " + cll.deleteAtEnd());
                    break;
                case 9:
                    System.out.print("Enter position: ");
                    position = in.nextInt();
                    System.out.println("Deleted: " + cll.deleteAtPosition(position));
                    break;
                case 10:
                    System.out.println("Exit...");
                    in.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Operation...");
                    break;
            }
        }
    }
}
