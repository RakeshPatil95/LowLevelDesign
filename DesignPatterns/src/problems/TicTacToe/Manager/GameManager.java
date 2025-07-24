package problems.TicTacToe.Manager;

import problems.TicTacToe.Piece.Piece;

public interface GameManager {

    Piece findWinner(Piece[][] board);

    void displayCurrentState(Piece[][] board);
}
