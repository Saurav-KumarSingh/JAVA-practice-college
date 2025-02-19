package linkedlist;

import java.util.Scanner;

class Node { 
    int info;
    Node next;

    Node(int info) {
        this.info = info; // store a value
        this.next = null;
    }
}

class SingleLinkedList {
    Node head;

    public void insert(int value) {
        Node new_Node = new Node(value);
        if (head == null) { // First node
            head = new_Node;
        } else { // Multiple nodes
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_Node;
        }
    }

    public void showList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("SLL is Empty...");
            return;
        }
        while (temp != null) {
            System.out.print(temp.info + "\t");
            temp = temp.next;
        }
        System.out.println(); // New line after printing
    }
}

public class Sll{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SingleLinkedList ob = new SingleLinkedList();

        while (true) {
            System.out.println("\n1. Insert\n2. Print\n3. Exit");
            System.out.print("Enter Choice: ");
            int cho = in.nextInt();
            switch (cho) {
                case 1:
                    System.out.print("Enter Info: ");
                    int value = in.nextInt();
                    ob.insert(value);
                    break;
                case 2:
                    System.out.println("List : ");
                    ob.showList();
                    break;
                case 3:
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
