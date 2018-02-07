package test;

import model.Board;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sample.Controller;

public class GameOfLifeTest {

    private Board board;
    private Controller controller;

    @Before
    public void ini() {
        board = new Board(10, 10);
        controller = new Controller(board);
    }

    @Test
    public void printBoardTest() {
        controller.printBoard();
    }

    @Test
    public void calculateAliveNegiborsTest() {
        board.setAlive(0,0);
        board.setAlive(0,1);
        int aliveNeighbors = controller.calculateAliveNeighbors(board.getCell(1, 1));
        Assert.assertEquals(2, aliveNeighbors);
    }


}
