package model;

public class Cell {

    private boolean isAlive;
    private int positionX;
    private int getPositionY;

    public Cell(boolean isAlive, int positionX, int getPositionY) {
        this.isAlive = isAlive;
        this.positionX = positionX;
        this.getPositionY = getPositionY;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getGetPositionY() {
        return getPositionY;
    }

    public void setGetPositionY(int getPositionY) {
        this.getPositionY = getPositionY;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "isAlive=" + isAlive +
                ", positionX=" + positionX +
                ", getPositionY=" + getPositionY +
                '}';
    }
}
