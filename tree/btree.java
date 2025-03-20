import java.util.Random;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
    Random rand = new Random(); // Random object for distributing nodes

    // Insert method with randomized left/right insertion
    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            insertNode(root, data);
        }
    }

    private void insertNode(Node root, int data) {
        if (root.left == null) {
            root.left = new Node(data);
        } else if (root.right == null) {
            root.right = new Node(data);
        } else {
            // Randomly choose whether to insert in left or right subtree
            if (rand.nextBoolean()) {
                insertNode(root.left, data);
            } else {
                insertNode(root.right, data);
            }
        }
    }

    // In-order traversal (Left, Root, Right)
    public void inorder() {
        inorderPrint(root);
        System.out.println();
    }

    private void inorderPrint(Node root) {
        if (root!=null) {
            inorderPrint(root.left);
            System.out.print(root.data+" ");
            inorderPrint(root.right);
        }
    }

    // Pre-order traversal (Root, Left, Right)
    public void preorder() {
        preorderPrint(root);
        System.out.println();
    }

    private void preorderPrint(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderPrint(root.left);
            preorderPrint(root.right);
        }
    }

    // Post-order traversal (Left, Right, Root)
    public void postorder() {
        postorderPrint(root);
        System.out.println();
    }

    private void postorderPrint(Node root) {
        if (root != null) {
            postorderPrint(root.left);
            postorderPrint(root.right);
            System.out.print(root.data + " ");
        }
    }

}

// Utility class for user input and menu-based interaction
public class btree{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1. Insert\n2. In-order Traversal\n3. Pre-order Traversal\n4. Post-order Traversal\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();
                    tree.insert(value);
                    break;
                case 2:
                    System.out.println("In-order Traversal:");
                    tree.inorder();
                    break;
                case 3:
                    System.out.println("Pre-order Traversal:");
                    tree.preorder();
                    break;
                case 4:
                    System.out.println("Post-order Traversal:");
                    tree.postorder();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
