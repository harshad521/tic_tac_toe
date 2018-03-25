package com.thoughtworks.ticTacToeLib;

public class Board {
    private Field[][] fields;
    private Status gameStatus = Status.PLAY;
    private int size;
    private int score=0;
    private Field.Symbol winner = Field.Symbol.NONE;
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

    public void setOwner(int row, int column, Field.Symbol owner) throws InvalidMoveException {
        validateMove( row, column );
        fields[row][column].setOwner(owner);
        evaluateBoard(owner);
        verifyDrawCondition();
    }

    private void validateMove(int row,int column) throws InvalidMoveException {
        if(!(fields[row][column].getFieldOwner() == Field.Symbol.NONE)){
            throw new InvalidMoveException();
        }
    }

    public Field.Symbol getWinner() {
        return winner;
    }

    private void evaluateFields(Field.Symbol player,int row, int column){
        if(fields[row][column].getFieldOwner()== player){
            this.score++;
        }
    }

    private void evaluateBoard(Field.Symbol player){
        for (int counter = 0; counter < 4; counter++) {
            if(this.gameStatus != Status.PLAY){
                break;
            }
            for (int row = 0; row < size; row++) {
                for (int column = 0; column < size; column++) {
                    if(counter == 0) {
                        evaluateFields( player, row, column );
                    }else if(counter==1){
                        evaluateFields( player, column, row );
                    }else if(counter==2){
                        evaluateFields(player,column,column);
                        row = size;
                    }else if(counter==3){
                        evaluateFields( player,column,(size-1)-column );
                        row=size;
                    }

                }
                if(score==size && this.winner == Field.Symbol.NONE){
                    this.winner=player;
                    this.gameStatus=Status.END;
                    break;
                }
                score=0;
            }
        }
    }

    public Status getGameStatus() {
        return gameStatus;
    }

    public enum Status{
        PLAY,END,DRAW
    }

    private void verifyDrawCondition(){
        int counter=0;
        for (int row=0;row<size;row++){
            for (int column = 0; column < size; column++) {
                if(fields[row][column].getFieldOwner()== Field.Symbol.NONE){
                    counter--;
                }else{
                    counter++;
                }
            }
        }
        if(counter==9 && winner==Field.Symbol.NONE){
            this.gameStatus = Status.DRAW;
        }
    }
}

