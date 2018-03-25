package com.thoughtworks.ticTacToeLib;

public class Game {
    private int size;
    private Board board;
    private Turn turn;
    private Player[] players;
    public Game(int size) {
        this.size = size;
        this.board = new Board(size);
        this.turn = new Turn( new Field.Symbol[]{Field.Symbol.X, Field.Symbol.O} );
    }
    public static Game createGame(){

    }

}
