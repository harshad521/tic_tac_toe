package com.thoughtworks.ticTacToeLib;

public class InvalidMoveException extends Exception {
    InvalidMoveException(){
        super("Invalid Move : Play valid move");
    }
}
