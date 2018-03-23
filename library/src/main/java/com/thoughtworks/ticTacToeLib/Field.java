package com.thoughtworks.ticTacToeLib;

public class Field {

    private Symbol owner = Symbol.NONE;

    public Symbol getFieldOwner() {
        return owner;
    }

    public void setOwner(Symbol owner) {
        this.owner = owner;
    }

    public enum Symbol {
        X, O, NONE
    }
}
