
import java.util.Scanner;
import java.util.Stack;

class Node {
    int data;
    Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }

}

class BST {
    Node root;

    public BST() {
    }

    void insert(int val) {
        Node newNode = new Node(val);
        if (root == null) {// root is empty
            root = newNode;
            return;
        }
        Node current = root, parent = null;
        while (current != null) {
            parent = current;
            if (val < current.data)
                current = current.left;
            else
                current = current.right;
        }
        if (val < parent.data)
            parent.left = newNode;
        else
            parent.right = newNode;

    }

    void inorder() {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current Node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Current must be null at this point
            current = stack.pop();
            System.out.print(current.data + "  ,  ");

            // Visit the right subtree
            current = current.right;
        }
    }

    void preorder() {
        if (root == null)
            return;
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current Node
            while (current != null) {
                System.out.print(current.data + "  ,  ");
                stack.push(current);// Save it to go right later
                current = current.left;// Move to left child
            }
            // When leftmost is reached, backtrack and move to right
            if (!stack.isEmpty()) {
                current = stack.pop();// Get the node we saved earlier
                current = current.right;// Now move to its right child
            }
        }
    }

    void postorder() {
        if (root == null)
            return;
    
        Stack<Node> stack = new Stack<>();
        Node current = root;
        Node lastVisited = null;
    
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left; // Go left
            } else {
                Node peekNode = stack.peek();
    
                // If right child exists and hasn’t been visited yet
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right; // Go right
                } else {
                    // Visit the node
                    System.out.print(peekNode.data + " , ");
                    lastVisited = stack.pop();
                }
            }
        }
    }
    

}

public class NonRecurssive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        int c, val;
        while (true) {
            System.out.println("\n1. insert\n2. Inorder\n3. Preorder\n4. Postordr\n5. exit\n\nEnter choice");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Enter info ");
                    val = sc.nextInt();
                    tree.insert(val);
                    break;
                case 2:
                    tree.inorder();
                    break;
                case 3:
                    tree.preorder();
                    break;
                case 4:
                    tree.postorder();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! try again");
            }
        }
    }
}
