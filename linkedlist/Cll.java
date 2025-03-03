package linkedlist;
import com.sun.net.httpserver.Headers;
import java.security.DrbgParameters;
import java.util.Scanner;
class Node
{
    int data;  // store infomation
    Node next;  // object of node class
    public Node(int data)
    {
        this.data=data; //new node 
        this.next=null;  // update at run time
    }
}
 // actual cll implementation
class CircularLinkedList{
    Node last=null; // head of the list
    void insert(int data){
        Node new_node=new Node(data); // nead to attach
        if(last==null) // first node
        {
            last=new_node;
            last.next=last; //point to itself , self centric
        }
        else // more than one node
        {
            new_node.next=last.next;
            last.next=new_node;
            last=new_node;
        }
    }
    void print(){
        if(last==null)
        {
            System.out.println("Empty list");
            return;
        }
        Node temp=last.next; // starting node begins
        do{
            System.out.print(temp.data + " ,");
            temp=temp.next;
        }while(temp!=last.next); //LAST NODE IS SAME AS FIRST
    }
    

}
public class Cll {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        CircularLinkedList ob=new CircularLinkedList();
        int cho;
        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. print");
            System.out.println("Enter choice ");
            cho=in.nextInt();
            if(cho==1)
            {
                System.out.println("Enter info ");
                int info=in.nextInt();
                ob.insert(info);
            }
            else if(cho==2)
            {
                ob.print();
            }
            else
            {
                break;
            }
        }
    }
}