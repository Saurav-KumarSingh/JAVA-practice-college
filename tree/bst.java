import java.util.Scanner;

class Node {
    int data;
    Node left, right; // Objects for left and right child nodes

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root; // Root of the BST

    // Insert method
    public void insert(int data) {
        root = insertRoot(root, data);
    }

    private Node insertRoot(Node root, int data) {
        if (root == null) { // Base case: create new node if tree is empty
            root = new Node(data);
            return root;
        }
        if (data < root.data) { // Traverse left subtree
            root.left = insertRoot(root.left, data);
        } else if (data > root.data) { // Traverse right subtree
            root.right = insertRoot(root.right, data);
        }
        return root;
    }

    // In-order traversal
    public void inorder() {
        inorderPrint(root);
    }

    private void inorderPrint(Node root) {
        if (root != null) {
            inorderPrint(root.left);
            System.out.println(root.data + " ");
            inorderPrint(root.right);
        }
    }

    // Pre-order traversal
    public void preorder() {
        preorderPrint(root);
    }

    private void preorderPrint(Node root) {
        if (root != null) {
            System.out.println(root.data + " ");
            preorderPrint(root.left);
            preorderPrint(root.right);
        }
    }

    // Post-order traversal
    public void postorder() {
        postorderPrint(root);
    }

    private void postorderPrint(Node root) {
        if (root != null) {
            postorderPrint(root.left);
            postorderPrint(root.right);
            System.out.println(root.data + " ");
        }
    }

    // Find the minimum value in the BST
    public int findMin() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }
        Node current = root;
        while (current.left != null) { // Move to the leftmost node
            current = current.left;
        }
        return current.data;
    }

    // Find the maximum value in the BST
    public int findMax() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }
        Node current = root;
        while (current.right != null) { // Move to the rightmost node
            current = current.right;
        }
        return current.data;
    }

    // Search for a value in the BST
    public boolean find(int value) {
        return findNode(root, value);
    }

    private boolean findNode(Node root, int value) {
        if (root == null) { // Base case: value not found
            return false;
        }
        if (value == root.data) { // Value found
            return true;
        }
        if (value < root.data) { // Search in the left subtree
            return findNode(root.left, value);
        } else { // Search in the right subtree
            return findNode(root.right, value);
        }
    }

    public int size(Node root) {
        if (root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public int sumOfNodes(Node root){
        if (root==null) return 0;
        return root.data+sumOfNodes(root.left)+sumOfNodes(root.right);
    }
}

public class bst {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n1. Insert\n2. In-order Traversal\n3. Pre-order Traversal\n4. Post-order Traversal");
            System.out.println("5. Find Minimum\n6. Find Maximum\n7. Search Value\n8. Size\n9. Sum of Nodes\n10. Exit...");
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
                    System.out.println("Minimum value in the tree: " + tree.findMin());
                    break;
                case 6:
                    System.out.println("Maximum value in the tree: " + tree.findMax());
                    break;
                case 7:
                    System.out.print("Enter value to search: ");
                    int searchValue = sc.nextInt();
                    if (tree.find(searchValue)) {
                        System.out.println("Value found in the tree.");
                    } else {
                        System.out.println("Value not found in the tree.");
                    }
                    break;
                case 8:System.out.println("Tree Size :"+tree.size(tree.root));
                    break;
                case 9:System.out.println("Sum of Nodes :"+tree.sumOfNodes(tree.root));
                    break;
                case 10:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
