package sample;

import model.Board;
import model.Cell;

public class Controller {

    private  Board board;

    public Controller(Board board) {
        this.board = board;
    }


    public void printBoard() {
        Cell[][] cells = board.getCell();
        for (int i = 0; i < board.getPoaitionX() ; i++) {
            for (int j = 0; j < board.getPoaitionY(); j++) {
                System.out.println(cells[i][j]);
            }
        }
    }
}
