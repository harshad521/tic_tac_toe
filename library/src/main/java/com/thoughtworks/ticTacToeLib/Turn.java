package com.thoughtworks.ticTacToeLib;

public class Turn {
    private final Field.Symbol[] players;
    private int currentPlayerIndex = 0;

    public Turn(Field.Symbol players[]){
     this.players = players;
    }

    public Field.Symbol getCurrentPlayer() {
        return players[currentPlayerIndex];
    }

    public void changeTurn() {
        currentPlayerIndex = 1- currentPlayerIndex;
    }
}
