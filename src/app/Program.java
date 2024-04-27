package app;

import chess.ChessMatch;
import chess.UI;

public class  Program {
	public static void main(String args[]) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		System.out.println();
	}
}
