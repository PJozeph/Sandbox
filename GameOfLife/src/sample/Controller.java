package sample;

import model.Board;
import model.Cell;

public class Controller {

    private Board board;

    public Controller() {
    }

    public Controller(Board board) {
        this.board = board;
    }

    public Board createNewGenegartion() {
        Board board = new Board(this.board.getPoaitionX(), this.board.getPoaitionY());
        return board;
    }


    public void printBoard() {
        Cell[][] cells = board.getCell();
        for (int i = 0; i < board.getPoaitionX(); i++) {
            for (int j = 0; j < board.getPoaitionY(); j++) {
                System.out.println(cells[i][j]);
            }
        }
    }

    public int calculateAliveNeighbors(Cell cell) {
        int counter = 0;
        for (int i = cell.getGetPositionY() - 1; i < cell.getPositionX(); i++) {
            for (int j = cell.getPositionX() - 1; j < cell.getPositionX(); j++) {
                try {
                    if (board.getCell(i, j).isAlive()) {
                        counter++;
                    }
                } catch (IndexOutOfBoundsException e) {
                    //donothing
                }
            }
        }
        return counter;
    }
}
