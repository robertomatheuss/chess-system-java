package org.example.application;

import org.example.chess.ChessMatch;
import org.example.chess.ChessPiece;
import org.example.chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition souce = UI.readChessPosition(scanner);

            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(scanner);

            ChessPiece capturedePiece = chessMatch.performChessMove(souce,target);
        }
    }
}