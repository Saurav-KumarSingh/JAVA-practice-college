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
    Node head=null;
    Node tail=null;

    public void insertAtEnd(int value) {
        Node new_Node = new Node(value);
        if (head == null) { // First node
            head = new_Node;
            tail = new_Node;  // Also set tail to new_Node
        } else { // Multiple nodes
            tail.next = new_Node; // Link the new node
            tail = new_Node;  // Move tail to the new node
        }
    }
    

    public void showList() {
        Node temp = head;  
        if (temp == null) {
            System.out.println("List is Empty...");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        } System.out.print("Null");
    }
    public int lengthList() {
        Node temp = head;  
        int count=0;
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
}

public class atEndSLL{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SingleLinkedListatEnd ob = new SingleLinkedListatEnd();
        System.out.print("This is For Performing Operatinons from End of LinkedList:\n\n");

        while (true) {
            System.out.println("\n-------------------Menu---------------------------\n");
            System.out.println("\n1. Insert\n2. Print\n3. List length\n4. Exit");
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
                    System.out.println("List : ");
                    ob.showList();
                    break;
                case 3:
                    
                    System.out.println("List Size : "+ob.lengthList());
                    break;
                case 4:
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
