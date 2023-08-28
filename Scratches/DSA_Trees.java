/*
    * DEMONSTRATION OF TREES IN JAVA   
 */

import packages.BinarySearchTreeMain;
import packages.BinarySearchTreeNode;

public class DSA_Trees {

    public static void main(String[] args) {
        
        // Trees 

        /*
            * Non - linear data structure where nodes are organized in a hierarchy. It means there are parent and child. 
                * e.g. file explorer, databases, DNS, HTML Document Object Model (DOM). 
            * Root node doesn't have any incoming edges, only outgoing edges. 
            * Any nodes that are on the buttom of the tree known as leaf nodes. 
            * In the middle of the three, where they are both parent and a child, they are known as branch nodes. 
            * Sub-tree - a smaller tree that is held by larger tree. 
            * Size of the three is equal to the number of nodes. 
            * Depth - number of edges per level below root node.
            * Height - number of edges above furthest leaf/child node. 
         */

        // Binary Trees 

        /* 
            * Binary trees are threes where each node has no more than two child/leaf nodes. 
            * The difference between binary search tree and binary tree is that, the left child of one parent/root node 
                is less than the value of the parent/root node. Whereas the right child will be greater than the value of 
                parent/child node.   
         */
        
         // Insantiating the main custom class of binary search tree. 
         BinarySearchTreeMain bst = new BinarySearchTreeMain();

         // Inserting nodes 
         bst.insert(new BinarySearchTreeNode(5));
         bst.insert(new BinarySearchTreeNode(1));
         bst.insert(new BinarySearchTreeNode(9));
         bst.insert(new BinarySearchTreeNode(2));
         bst.insert(new BinarySearchTreeNode(7));
         bst.insert(new BinarySearchTreeNode(3));
         bst.insert(new BinarySearchTreeNode(6));
         bst.insert(new BinarySearchTreeNode(4));
         bst.insert(new BinarySearchTreeNode(8));

         // displaying a binary tree 
         System.out.println("Displaying Binary Tree : ");
         bst.display();

         // removing one data 
         bst.remove(1);

         // displaying a binary tree after removing one data
         System.out.println(" Displaying Binary Tree after removing one data :");
         bst.display();

         // displaying a data inside a binary tree using search so it is binary search tree 
         System.out.println("\nData 8 is found? : " + bst.search(8));

    }
    
}
