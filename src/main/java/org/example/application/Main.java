package org.example.application;

import org.example.chess.ChessException;
import org.example.chess.ChessMatch;
import org.example.chess.ChessPiece;
import org.example.chess.ChessPosition;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true){
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(scanner);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(),possibleMoves);

                System.out.println();
                System.out.println("Target: ");
                ChessPosition target = UI.readChessPosition(scanner);

                ChessPiece capturedePiece = chessMatch.performChessMove(source,target);
            }catch (ChessException | InputMismatchException exception){
                System.out.println(exception.getMessage());
                scanner.nextLine();
            }
        }
    }
}