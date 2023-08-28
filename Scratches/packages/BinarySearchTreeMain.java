package packages;

public class BinarySearchTreeMain {
    
    // declaring root of this class. 
    BinarySearchTreeNode root;

    // insert method 
    public void insert (BinarySearchTreeNode node) {
        root = insertHelper(root, node);
    }

    // insert method helper 
    private BinarySearchTreeNode insertHelper (BinarySearchTreeNode root, BinarySearchTreeNode node) {

        int data = node.data;

        if (root == null) {
            root = node;
            return root;
        }
        else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        }
        else {
            root.right = insertHelper(root.right, node);
        }

        return root;

    }

    // display method
    public void display () {
        displayHelper(root);
    }

    // display helper method 
    private void displayHelper (BinarySearchTreeNode root) {

        if (root != null) {
            displayHelper(root.left);
            System.out.print(root.data + " -> ");
            displayHelper(root.right); 
        }

    }
     
    // search method 
    public boolean search (int data) {

        return searchHelper(root, data);

    }

    // search helper method 
    private boolean searchHelper (BinarySearchTreeNode root, int data) {

        if (root == null) {
            return false;
        }
        else if (root.data == data) {
            return true;
        }
        else if (root.data > data) {
            return searchHelper(root.left, data);
        }
        else {
            return searchHelper(root.right, data);
        }

    }

    // remove method 
    public void remove (int data) {

        if (search(data)) {
            removeHelper(root, data);
        }
        else {
            System.out.println("Data " + "could not be found.");
        }

    }

    // remove helper method 
    private BinarySearchTreeNode removeHelper (BinarySearchTreeNode root, int data) {

        if (root == null) {
            return root;
        }
        else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        }
        else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        }
        else { // node was found.
            if (root.left == null && root.right == null) {
                root = null;
            }
            else if (root.right != null) { // find a successor to replace this node. 
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else { // to find a predecessor to replace this deleted node. 
                root.data = predecessor(root);
                root.right = removeHelper(root.left, root.data); 
            }
        }

        return root;

    }

    // if we have to move data around, removeHelper has to have its own helper too. 
    // we will name it successor and predecessor. 
    private int successor (BinarySearchTreeNode root) { // find the least value below the right child of this root node. 
        
        root = root.right;

        while (root.left != null) {
            root = root.left;
        }

        return root.data;

    }

    private int predecessor (BinarySearchTreeNode root) { // find the greatest value below the left child of this root node. 

        root = root.left;

        while (root.right != null) {
            root = root.right;
        }

        return root.data;

    }

}
