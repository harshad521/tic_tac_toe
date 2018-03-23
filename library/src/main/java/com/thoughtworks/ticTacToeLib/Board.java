package com.thoughtworks.ticTacToeLib;

public class Board {
    private Field[][] fields;
    private int size;
    public Board(int size) {
        this.size = size;
        fields = new Field[size][size];
         for (int row=0;row<size;row++){
             for (int column = 0; column < size; column++) {
                 fields[row][column] = new Field();
             }
         }
    }

    public int getSize() {
        return size;
    }

    public Field.Symbol getOwner(int row, int column) {
        return fields[row][column].getFieldOwner();
    }

    public void setOwner(int row, int column, Field.Symbol owner) {
        fields[row][column].setOwner( owner);
    }
}
