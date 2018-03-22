package com.thoughtworks.ticTacToeLib;

public class Field {

    private final char owner;
    private final int id;

    public Field(char owner, int id) {
        this.owner = owner;
        this.id = id;
    }

    public char getCoinOwner() {
        return owner;
    }

    public int getId() {
        return id;
    }
}
