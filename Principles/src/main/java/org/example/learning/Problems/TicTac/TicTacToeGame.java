package org.example.learning.Problems.TicTac;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Objects
// pieces, Board, players
public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    TicTacToeGame() {
        initilizeGame();
    }

    private void initilizeGame() {

        // creating 2 players
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtsPiece);

        players.add(player1);
        players.add(player2);

        // initilizeBoard
        gameBoard = new Board(3);
    }

    public String startGame() {

        boolean noWinner = true;
        while (noWinner) {

            // take out the player whose turn is and also put the player in the list back
            Player playerTurn = players.removeFirst();

            // get the free space from the board
            gameBoard.printBoard();
            List<Pair<Integer,Integer>> freespaces = gameBoard.getFreeCells();
            if(freespaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            // read the user input
            System.out.println("Player:" + playerTurn.name + "  Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputColumn, playerTurn.playingPiece);
            if(!pieceAddedSuccessfully) {
                // player can not insert the piece into this cell, palyer has to choose another cell
                System.out.println("Incorrect position choosen please try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if(winner) {
                return playerTurn.name;
            }
        }

        return "Tie";
    }

    private boolean isThereWinner(int inputRow, int inputColumn, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // need to check in row 
        for (int i = 0; i < gameBoard.size; i++) {

            if(gameBoard.board[inputRow][i] == null || gameBoard.board[inputRow][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        // need to check in column
        for (int i = 0; i < gameBoard.size; i++) {

            if(gameBoard.board[i][inputColumn] == null || gameBoard.board[i][inputColumn].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        // need to check in diagonal
        for (int i = 0, j=0; i < gameBoard.size; i++, j++) {

            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        // need to check in ant-diagonal
        for (int i = 0, j=gameBoard.size-1; i < gameBoard.size; i++, j--) {

            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

    // N-Queens problem
    // N-Queens problem
}

