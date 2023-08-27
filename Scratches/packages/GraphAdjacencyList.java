package packages;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class GraphAdjacencyList {

    // Making the array list of linked list since the connections of nodes in the adjacency list is via the linked lists 
    // that are stored in the array list. 
    ArrayList<LinkedList<AdjacencyListInputNode>> aList;
    // Created an array list of linked list that accepts a class that makes the input of node. It is named as aList.

    // making constructor to get the data from the user's input and process it to the array list. 
    public GraphAdjacencyList () {
        aList = new ArrayList<>();
        // To instantiate the array list named aList.
    }

    // method for adding node. 
    public void addNode (AdjacencyListInputNode Node) {
        // to add a node in the array list, we have to declare a linkedlist since in the adjacency matrix, the indexes in the
        // array list will have an element of linked list. 
        LinkedList<AdjacencyListInputNode> currentList = new LinkedList<>();
        // this linked list declaration will accept the class of adjacency list input node for this class processes the input
        // of nodes. 
        currentList.add(Node);
        // after declaring the linkedlist, we have to add the node value in the linked list. 
        aList.add(currentList); 
        // after adding the node input value in the linked list, the created linked list will be passed thru an index of 
        // array list.
    }

    // method for adding edges. 
    public void addEdge (int src, int dest) {
        // Declaring linked list that accepts adjacency list input node class on this method to get the specific source node. 
        LinkedList<AdjacencyListInputNode> currentList = aList.get(src);
        // This linked list declaration gets the index of the node in the array list as source or where index number is the 
        // destination node is going to connect. 

        // Instantiating the adjacency list input node named destination node and passing the index of the destination node
        // target. there is also get(index:0) to ensure that the aList will get a node from the sources from the indexes. 
        AdjacencyListInputNode destNode = aList.get(dest).get(0);
        // And lastly, the instantiated destNoe object will be linked to a speficic linked list on some indexes.
        currentList.add(destNode);
    }

    // method for adding edges. 
    public boolean checkEdge (int src, int dest) {
        // Declaring linked list that accepts adjacency list input node class on this method to get the specific source node. 
        LinkedList<AdjacencyListInputNode> currentList = aList.get(src);
        // Instantiating the adjacency list input node named destination node and passing the index of the destination node
        // target. there is also get(index:0) to ensure that the aList will get a node from the sources from the indexes. 
        AdjacencyListInputNode destNode = aList.get(dest).get(0);
        
        // creating an enhanced for loop to traverse the linked list. 
        // Instantiating a class adjacency list input node and get data from the linked list current list one by one. 
        for (AdjacencyListInputNode node : currentList) {
            // while traversing linked list at this specific index of the array list, if the object linked node member 
            // is equal to the asking destination node, then the source or the header of this linked list is adjacent or
            // connected to the asking destination node.
            if (node == destNode)    
                return true;
        }
        // while traversing, if the asking node is not found in the specific current list, then the source and destination 
        // node is not adjacent. 
        return false;
    }

    // method to print the array list of linked list. 
    public void print () {
        // using nested enhanced for loop to print all the linked lists in the array list. 
        // the first loop is to get the linked list for every indexes of array list. 
        // the currentList will get the linked list of every index in the aList.
        for (LinkedList<AdjacencyListInputNode> currentList : aList) {
            // this second loop will get every nodes in the linked list and to be passed to the object node which was 
            // instantiated from class adjacency list input node. 
            for (AdjacencyListInputNode node : currentList) {
                // the node will then print the data. 
                System.out.print(node.data + " -> ");
            }
            // After finishing on traversing the linked list on one index of array list and getting all the nodes, 
            // it will give next line spacing.
            System.out.println();
        }
        
    }

    // method for Depth-First Search traversal
    public void depthFirstSearchAList(int startNode) {

        // declaring array of booleans to store the visited nodes in the graph. 
        boolean[] visited = new boolean[aList.size()];
        // declaring stack to store also the visited nodes in the graph. 
        // Its difference to declared array of booleans is that, stack will operate the backtracking and depth searching
        // while as the array of booleans will just keep track of the visited nodes. 
        Stack<Integer> stack = new Stack<>();
        // push immediately to the stack the first visited node. 
        stack.push(startNode);

        // when the depthFirstSearchAList method is called, surely there would be a data in a stack. Therefore, in this loop
        // it will continue to traverse since the condition was while stack is not empty. 
        while (!stack.isEmpty()) {
            // declaring current node to have a pop function to stack if the currentNode is already visited. 
            int currentNode = stack.pop();
            // if currentNode is not yet visited, then set the current node to true to marked as visited. 
            if (!visited[currentNode]) {
                visited[currentNode] = true;

                // Print the character data of the current node
                // pattern of getting the character data to array list of linked list:
                // call the arraylist first to get the index of current node, by this it will get the linked list.
                // then get the index of the current node or get(0). Finally get the data of the linked list.
                System.out.print(aList.get(currentNode).get(0).data + " -> ");
                // declare a linked list that accepts the class Adjacency List Input Node to get the element of index 
                // of array list that accepts linked list. 
                LinkedList<AdjacencyListInputNode> currentList = aList.get(currentNode);
                // declaring a enhanced for loop to get the values of the linked list which is class of Adjacency list input node.
                for (AdjacencyListInputNode node : currentList) {
                    // Convert character data back to index by subtracting 'A'
                    int neighbor = node.data - 'A';
                    // if the node neighbor of the current node is not yet visited, push it to the stack.
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }

    }
    
}
