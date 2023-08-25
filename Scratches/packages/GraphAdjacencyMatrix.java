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

        // using enhanced for loop to print the row header and column header of the adjacency matrix 
        System.out.print("  ");
        for (AdjacencyMatrixInputNode nodeData : nodes) {
            System.out.print(nodeData.nodeData + " ");
        }
        System.out.println();

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            System.out.print(nodes.get(i).nodeData + " ");
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
