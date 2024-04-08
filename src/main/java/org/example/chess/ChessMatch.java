package org.example.chess;

import org.example.boardgame.Board;
import org.example.boardgame.Position;
import org.example.chess.pieces.King;
import org.example.chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
        inicialSetup();
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] matriz=new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0;i< board.getRows();i++){
            for (int j = 0; j < board.getColumns(); j++) {
                matriz[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return matriz;
    }
    public void inicialSetup(){
        board.placePiece(new Rook(board,Color.WHITE),new Position(2,1));
        board.placePiece(new King(board,Color.BLACK),new Position(0,4));
        board.placePiece(new King(board,Color.WHITE),new Position(7,4));

    }
}
