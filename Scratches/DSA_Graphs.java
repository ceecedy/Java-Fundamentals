/*
    * DEMONSTRATION OF GRAPHS IN JAVA (PURELY NOTES) 
 */

import packages.GraphAdjacencyMatrix;
import packages.AdjacencyMatrixInputNode;

public class DSA_Graphs {

    public static void main(String[] args) {
        
        // GRAPHS

        /*
            * A non-linear aggrogation of nodes. 
            * Every nodes can also be called as vertex. Every nodes or vertex has data on it.
            * The connection of two nodes are called edges. 
            * when two nodes have edges, then we can say that, that two nodes are adjacent to each other. 
                Depending on what kind of edges they have. 
                
            * Undirected Graph: 
                - This was used in social media applications. 

            * Directed Graph: 
                - Contains edges that will link one node to another. This are one way connection only. 
                - Example of the directed graph is a map. 

            * There are two popolar ways to represent or implement a graph. 
                - Adjacency list 
                - Adjacency Matrix 
            * In Adjacenct Matrix, we can make a 2D array that represents the connections of the node. 
                1 if there's a connection between two nodes and if none, 0.
            * In Adjacency list, it is an array list of linked list. where it shows the connections of nodes in a linked list
                way per indexes of array list. 
            * For instance if we have to find if one node is adjacent to the other node, we have to look for that node via its
                linked list connection, if the other node was found on via traversing the linked list, then the two nodes 
                are having an adjacency to one another. 
         */

        // Implementation of Adjacency Matrix
        GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(5); 

        // to add a node in the adjacency matrix. 
        // making an anonymous insertion of data to the adjacency matrix.  
        graph.addNode(new AdjacencyMatrixInputNode('A'));
        graph.addNode(new AdjacencyMatrixInputNode('B'));
        graph.addNode(new AdjacencyMatrixInputNode('C'));
        graph.addNode(new AdjacencyMatrixInputNode('D'));
        graph.addNode(new AdjacencyMatrixInputNode('E')); 

        // adding edges to the nodes or vertex.
        graph.addEdge(0, 1); // Node A has one way connection to node B 
        graph.addEdge(1, 2); // Node B has one way connection to node C
        graph.addEdge(1, 4); // Node B has one way connection to node E
        graph.addEdge(2, 3); // Node C has one way connection to node D
        graph.addEdge(2, 4); // Node C has one way connection to node E
        graph.addEdge(4, 0); // Node E has one way connection to node A
        graph.addEdge(4, 2); // Node E has one way connection to node C

        // printing the adjacency matrix to repreent tht graph. 
        graph.print();

        // to check if there's an edge between two nodes
        System.out.println("\nIs node A -> B? : " + graph.checkEdge(0, 1));
        

    }

}
