package problems.TicTacToe;

import problems.TicTacToe.Game.Game;
import problems.TicTacToe.Game.Player;
import problems.TicTacToe.Game.TicTacToeGame;
import problems.TicTacToe.Manager.GameManager;
import problems.TicTacToe.Manager.TicTacToeGameManager;
import problems.TicTacToe.Piece.PieceFactory;
import problems.TicTacToe.Piece.PieceType;

import java.util.Deque;
import java.util.LinkedList;

public class GameClient {
    public static void main(String[] args) {
        Deque<Player> deque = new LinkedList<>();
        Player p1 = new Player("Ramesh" , PieceType.X);
        Player p2 = new Player("Rajesh", PieceType.O);
        deque.add(p1);
        deque.add(p2);
        GameManager gameManager = new TicTacToeGameManager();
        PieceFactory pieceFactory = new PieceFactory();
        Game ticTocToe = new TicTacToeGame(deque , gameManager , pieceFactory);
        ticTocToe.start();
    }
}
