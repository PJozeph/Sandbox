package model;

public class Board {

    private Cell cell[][];
    private int poaitionX;
    private int poaitionY;


    public Board(int x, int y) {
        cell = new Cell[x][y];
        this.poaitionX = x;
        this.poaitionY = y;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                cell[i][j] = new Cell(false,i,j);
            }
        }
    }

    public Cell getCell(int x, int y) {
        return cell[x][y];
    }

    public Cell[][] getCell() {
        return cell;
    }

    public void setCell(int x, int y) {
        this.cell[x][y] = cell[x][y];
    }

    public int getPoaitionX() {
        return poaitionX;
    }

    public int getPoaitionY() {
        return poaitionY;
    }

    public void setAlive(int x, int y){
        this.getCell(x,y).setAlive(true);
    }
}
