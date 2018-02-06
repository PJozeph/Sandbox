package test;

import model.Board;
import org.junit.Before;
import org.junit.Test;
import sample.Controller;

public class GameOfLifeTest {

    private Board board ;
    private Controller controller;

    @Before
    public void  ini(){
        board = new Board(10,10);
        controller = new Controller(board);
    }

    @Test
    public void printBoardTest(){
        controller.printBoard();
    }



}
