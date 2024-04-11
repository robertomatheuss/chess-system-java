package org.example.chess;

import org.example.boardgame.BoardException;

public class ChessException extends BoardException {
    public ChessException(String msg){
        super(msg);
    }
}
