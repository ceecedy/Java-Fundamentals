/*
    * DSA 2
    * THIS PROGRAM WILL DEMONSTRATE THE USAGE OF 2D ARRAY.  
 */

import java.util.Arrays;

class Board {

    // Implementation of board of tic-tac-toe
    char[][] board = new char[3][3];

    public Board() {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) 
                board[i][j] = '-';
        }
    }

    public void newDeclarationBoard() {

        /*
            * This is the another way of declaring 2D arrays with specified values. 
            * Syntax was like declaring an anonymous class. You instiantiated it and you declare it's values. 
         */
        char[][] newBoard = new char[][] {
            new char[] {'O', 'X', 'O'},
            new char[] {'X', 'O', 'X'},
            new char[] {'O', 'X', 'O'}
        };

        System.out.println(Arrays.deepToString(newBoard));
    }

}

public class DSA_2DArray {
    
    public static void main(String[] args) {
        
        // ********************************************************************************************************* // 

        Board game = new Board();

        // deeptoString is used to print all values of 2d array name game.board.  
        System.out.println("Printing board in a linear way using deepToString : ");
        System.out.println(Arrays.deepToString(game.board));

        System.out.println("Printing the board using for-loop : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("------------- ");
                System.out.println("| " +game.board[i][j] + " | " + game.board[i][j] + " | " + game.board[i][j] + " |");
            }
        }
        System.out.println("------------- ");

        // ********************************************************************************************************* // 

        // Printing new board using another way of declaring values of the declared 2D array. 
        game.newDeclarationBoard();

    }

}

/*
    * Arrays.deepToString(Object)
        - Used in 2D arrays to print all string values inside of it. 
 */
