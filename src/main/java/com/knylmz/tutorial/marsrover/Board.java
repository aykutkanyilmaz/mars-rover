package com.knylmz.tutorial.marsrover;

public class Board {
    private int x, y;

    public Board(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void putRover(Rover r) {
        r.setBoard(this);
    }

    public boolean canRoverMovePosition(int roverX, int roverY) {
        if (roverX > x || roverY > y || roverX < 0 || roverY < 0) {
            return false;
        }
        return true;
    }
}
