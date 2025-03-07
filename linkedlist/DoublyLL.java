package linkedlist;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DLLMethods {
    Node head = null;
    Node tail = null;
    int size = 0;

    void insertAtBegining(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;//updating tail to new node
        }
        size++;
    }

    void insertAtPosition(int position, int val) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid Position...");
            return;
        } else if (position == 1) {
            insertAtBegining(val);
            return;
        } else if (position == size + 1) {
            insertAtEnd(val);
            return;
        } else {
            Node newNode = new Node(val);
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
        }
        size++;
    }

    //deletion operations

    int deleteFromBegin(){
        Node temp=head;
        if (head==null) {
            System.out.println("List is empty...");
            return -1;
        }else{
            
            head=head.next;
            head.prev=null;
        }
        size--;
        return temp.data;
    }

    void display() {
        Node temp = head;
        System.out.print("\nNull <=> ");
        while (temp != null) {
            System.out.print(temp.data + " <=> ");
            temp = temp.next;
        }
        System.out.print("Null\n\n");
    }
}

public class DoublyLL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DLLMethods ob = new DLLMethods();
        System.out.print("This is For Performing Operatinons from End of LinkedList:\n\n");

        while (true) {
            System.out.println("\n\n-------------------Menu---------------------------\n");
            System.out.println(
                    "1. Insert at Begining\n2. Insert at End\n3. Insert at Position\n4. Delete from Bigining\n5. display \n6. Size\n7. Exit");
            System.out.println("\n--------------------------------------------------\n");
            System.out.print("Enter Choice: ");
            int cho = in.nextInt();
            int value;
            int position;

            switch (cho) {
                case 1:
                    System.out.print("Enter data: ");
                    value = in.nextInt();
                    ob.insertAtBegining(value);
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    value = in.nextInt();
                    ob.insertAtEnd(value);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    value = in.nextInt();
                    System.out.print("Enter position: ");
                    position = in.nextInt();
                    ob.insertAtPosition(position, value);
                    break;
                case 4:
                    System.out.println("Deleted : "+ob.deleteFromBegin());
                    break;
                case 5:
                    ob.display();
                    break;

                case 6:
                    System.out.println("Size : "+ob.size);
                    break;
                case 7:
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
