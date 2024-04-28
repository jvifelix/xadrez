package app;

import static java.lang.System.out;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.UI;

public class  Program {
	public static void main(String args[]) {
		
		ChessMatch chessMatch = new ChessMatch();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			out.print("Source: ");
			ChessPosition source = UI.readChessPosition(scanner);
			out.println();
			out.print("Target: ");
			ChessPosition target = UI.readChessPosition(scanner);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			
			
		}
	}
}
