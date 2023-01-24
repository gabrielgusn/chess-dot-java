package chess;

import boardgame.Position;

public class ChessPosition {

    private char column;
    private int row;


    public ChessPosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8 ){
            throw new ChessException("Error instantiating ChessPosition. Valid values are from A1 to H8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        return new Position(8 - this.row, this.column - 'a');
    }

    protected static ChessPosition toChessPosition(Position position){
        return new ChessPosition((char) ('a' - position.getColumn()), position.getRow() + 8);
    }

    @Override
    public String toString(){
        return "" + column + row;
    }
}
