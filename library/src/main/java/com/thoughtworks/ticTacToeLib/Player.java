package com.thoughtworks.ticTacToeLib;

public class Player {
    private final Field.Symbol symbol;
    private final String name;

    public Player(Field.Symbol symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Field.Symbol getSymbol() {
        return symbol;
    }
}
