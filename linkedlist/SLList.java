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

class SingleLinkedListatEnd {
    Node head = null;
    Node tail = null;

    void insertAtEnd(int value) {
        Node new_Node = new Node(value);
        if (head == null) { // First node
            head = new_Node;
            tail = new_Node; // Also set tail to new_Node
        } else { // Multiple nodes
            tail.next = new_Node; // Link the new node
            tail = new_Node; // Move tail to the new node
        }
    }

    void insertAtBegining(int value) {
        Node new_Node = new Node(value);
        if (head == null) { // First node
            head = new_Node;
            tail = new_Node; // Also set tail to new_Node
        } else { // Multiple nodes
            new_Node.next = head;// refering first Node to existing Node
            head = new_Node;// poiniting head to new Node
        }
    }

    void insertAtPosition(int position, int value) {

        if (position > lengthList() || position < 0) {
            System.out.println("Invalid Position...");
            return;
        } else if (position == lengthList()) {
            insertAtEnd(value);
            return;
        } else if (position == 0) {
            insertAtBegining(value);
            return;
        }
        Node new_Node = new Node(value);
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        new_Node.next = temp.next;
        temp.next = new_Node;
    }

    void showList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is Empty...");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    int lengthList() {
        Node temp = head;
        int count = 0;
        if (temp == null) {
            System.out.println("List is Empty...");
            return 0;
        }
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    int getAt(int idx) {
        Node temp = head;
        if (idx <= 0 || idx > lengthList()) {
            System.out.println("Invalid position...");
            return -1;
        } else if (temp == null) {
            System.out.println("List is Empty...");
            return -1;
        }
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // delete

    int deleteAtBegin() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Empty list");
            return -1;
        }
        head = head.next;
        return temp.data;
    }

    int deleteAtEnd() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Empty list");
            return -1;
        } else if (head.next == null) {
            head = null;
            tail = null;
            return temp.data;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int data = temp.next.data;
        tail = temp;
        temp.next = null;
        return data;
    }

    int deleteAtPosition(int position) {
        Node temp = head;
        if (position > lengthList() || position < 0) {
            System.out.println("Invalid Position...");
            return -1;
        } else if (position == lengthList()) {
            return deleteAtEnd();
        } else if (position == 0) {
            return deleteAtBegin();
        } else if (temp == null) {
            System.out.println("Empty list");
            return -1;
        }
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        Node deletedNode = temp.next;
        temp.next = temp.next.next;
        return deletedNode.data;
    }

}

public class SLList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SingleLinkedListatEnd ob = new SingleLinkedListatEnd();
        System.out.print("This is For Performing Operatinons from End of LinkedList:\n\n");

        while (true) {
            System.out.println("\n\n-------------------Menu---------------------------\n");
            System.out.println(
                    "1. Insert at End\n2. Insert at Begining\n3. Insert at Position\n4. Print\n5. List length\n6. get Node At\n7. delete atBegining\n8. delete atEnding\n9. delete at Position\n10. Exit");
            System.out.println("\n--------------------------------------------------\n");
            System.out.print("Enter Choice: ");
            int cho = in.nextInt();
            switch (cho) {
                case 1:
                    System.out.print("Enter data: ");
                    int value = in.nextInt();
                    ob.insertAtEnd(value);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    value = in.nextInt();
                    ob.insertAtBegining(value);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    value = in.nextInt();
                    System.out.print("Enter position: ");
                    int position = in.nextInt();
                    ob.insertAtPosition(position, value);
                    break;

                case 4:
                    System.out.println("List : ");
                    ob.showList();
                    break;
                case 5:
                    System.out.println("List Size : " + ob.lengthList());
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    position = in.nextInt();
                    System.out.println("Node data At : " + ob.getAt(position));
                    break;
                case 7:
                    System.out.print("Deleted : " + ob.deleteAtBegin());
                    break;
                case 8:
                    System.out.print("Deleted : " + ob.deleteAtEnd());
                    break;
                case 9:
                    System.out.print("Enter position: ");
                    position = in.nextInt();
                    System.out.print("Deleted : " + ob.deleteAtPosition(position));
                    break;
                case 10:
                    System.out.println("Exit...");
                    in.close(); // Close scanner
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Operation...");
                    break;
            }
        }
    }
}
