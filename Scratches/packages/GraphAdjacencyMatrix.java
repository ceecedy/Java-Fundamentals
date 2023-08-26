package packages;

import java.util.ArrayList;

public class GraphAdjacencyMatrix {

    // Adding headers to the rows and columns 
    ArrayList<AdjacencyMatrixInputNode> nodes;
    // Declaring the 2D array need to represent the adjacency matrix. 
    int[][] adjacencyMatrix;

    // constructor to input data in this adjacency matrix 2d array. 
    public GraphAdjacencyMatrix(int size) {
        nodes = new ArrayList<>();
        adjacencyMatrix = new int[size][size]; 
    }

    // method to add node in this 2d matrix. 
    // adding headers into the rows and columns using the constructor.
    public void addNode (AdjacencyMatrixInputNode node) {
        // void because it doesn't have to return something.
        // using the class input node as parameter for the constructor of input node is in that class. 
        nodes.add(node);
        // this nodes.add is to add the header into the array list to be used as header. 
    }

    // method to make edges to two nodes. 
    public void addEdge (int src, int dest) {
        // source (src) will be the row, destination (dest) will be the column.
        adjacencyMatrix[src][dest] = 1;
        // giving a value to 1 to say that there's a edge between two nodes.
    }

    // method to check if there's edges to two nodes. 
    public boolean checkEdge (int src, int dest) {
        if (adjacencyMatrix[src][dest] == 1) {
            // checking to see if there's a connection between two nodes. 
            return true;
        }
        return false; 
    }

    // method to represent the graph with this adjacency matrix 
    public void print() {

        // using enhanced for loop to print the column header of the adjacency matrix 
        System.out.print("  "); // to have spacing in the header above ior header in the column.
        for (AdjacencyMatrixInputNode nodeData : nodes) {
            // passing every values of array list nodes to the class nodeData since the values inside the array list nodes
            // are objects from class nodedata. So it is possible.
            System.out.print(nodeData.nodeData + " ");
            // printing the nodeData or the values and made as headers of the adjacency matrix
        }
        System.out.println(); // spacing from header title to the values of adjacency matrix. 

        // To print the values of the adjacency matrix. 
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            // to print the row header of the adjacency matrix
            System.out.print(nodes.get(i).nodeData + " ");
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    // essential not to make static method.
    public void depthFirstSearchAMatrix(int src) {

         // DEPTH FIRST SEARCH (DFS)

        /*
            * search algorithm to traverse a tree or graph data structure. 
            
            * Steps on this search algorithm: 
                * Pick a route 
                * Keep going until you reach the dead end, or previously visited node.
                * Backtrack to the last node that has unvisited adjacent neighbors.
            
            * Take note that Depth first search is using stack for every nodes visited. 
        */

        // to keep the track of the visited nodes. 
        boolean[] visited = new boolean[adjacencyMatrix.length];
        dfsHelperAMatrix(src, visited);

    }

    // helper for the depth first search. 
    private void dfsHelperAMatrix(int src, boolean[] visited) {

        // base case.
        // if this returns true, then the current index of this visited array of booleans is already visited
        // need to backtrack. 
        if (visited[src]) {
            return;
        }
        else {
            // if not yet visited, set the current source index to true to set as the current node is visited. 
            visited[src] = true; 
            // print the visited node, display the current node using the src index and pass it to the node array list that
            // contains class Adjacency Matrix Input mode.
            System.out.println(nodes.get(src).nodeData + " : visited  ");
        } 
    
        for (int i = 0; i < adjacencyMatrix[src].length; i++) {
            if (adjacencyMatrix[src][i] == 1) {
                dfsHelperAMatrix(i, visited);
                // special mention: 
                // if it happens that recursion happens and that recursion stack finishes the loop without 
                // findings of adjacency, it will return to this call and it WILL CONTINUE THE LOOP.
                // Happens when the source is Node A or 0
            }
        }

        return;

    }
    
}
