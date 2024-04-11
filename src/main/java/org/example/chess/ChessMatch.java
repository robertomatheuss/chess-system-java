package org.example.chess;

import org.example.boardgame.Board;
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
    private void placeNewPiece(char column,Integer row, ChessPiece piece){
        board.placePiece(piece,new ChessPosition(column,row).toPosition());
    }

    private void inicialSetup(){
        placeNewPiece('b',6,new Rook(board,Color.WHITE));
        placeNewPiece('e',8,new King(board,Color.BLACK));
        placeNewPiece('e',1,new King(board,Color.WHITE));
    }
}
