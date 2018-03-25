package com.thoughtworks.ticTacToeLib;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
    private int size;
    private Board board;
    private Turn turn;
    private Player players[];

    public Game(int size, String[] playerNames) {
        players = new Player[2];
        this.size = size;
        this.board = new Board(size);
        this.turn = new Turn( new Field.Symbol[]{Field.Symbol.X, Field.Symbol.O} );
        addPlayer(playerNames);

    }

    private void addPlayer(String[] playerNames) {
        players[0]= new Player(Field.Symbol.X,playerNames[0]);
        players[1]= new Player(Field.Symbol.O,playerNames[1]);
    }

    public String getPlayerNameBySymbol(Field.Symbol symbol) {
        if (players[0].getSymbol() == symbol) return players[0].getName();
        else return players[1].getName();
    }
}
