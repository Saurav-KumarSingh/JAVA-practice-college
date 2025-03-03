package linkedlist;

import java.util.Scanner;

class Node{
    int data;//info
    Node prev,next;//object, pointing to node
    Node(int data){//constructor
        this.data=data;//save info in node
        this.prev=this.next=null;//Null for new Node
    }
}

class DllMethods{
    Node head;//Begin Dll
    void insert(int item){
        Node newNode=new Node(item);
        if(head==null){//list is empty or first case
            head=newNode;
        }
        else{//list have already nodes
            Node temp=head;
            while (temp.next!=null) { //upto last node
                temp=temp.next;//jump to next node
            }
            temp.next=newNode;//last node connecting to new node
            newNode.prev=temp;//new Node connecting its prev with LAST
        }
    }
    void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is Empty");
            return;
        }
        System.out.print("NULL <=> ");
        while (temp != null) { // Traverse till LAST node
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print(" <=> ");
            }
        }
        System.out.println(" <=> NULL");
    }
    
}

public class DLL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DllMethods ob = new DllMethods();
        int choice, item;
    
        while (true) {
            System.out.println("1. Add\n2. Print\n3. Exit\n");
            System.out.print("Enter Your Choice: ");
            choice = in.nextInt();
    
            switch (choice) {
                case 1:
                    System.out.println("Enter no.");
                    item = in.nextInt();
                    ob.insert(item);
                    break;
                case 2:
                    ob.print();
                    break;
                case 3:
                    in.close();  // Close scanner before exiting
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
}
