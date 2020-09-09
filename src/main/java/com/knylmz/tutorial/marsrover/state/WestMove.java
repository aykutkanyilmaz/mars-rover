package com.knylmz.tutorial.marsrover.state;

import com.knylmz.tutorial.marsrover.ROVER_DIRECTION;
import com.knylmz.tutorial.marsrover.Rover;

public class WestMove implements Movable {


    public RoverState move(Rover rover) {
        int nextPositionX = rover.getX() + 1;
        int nextPositionY = rover.getY();
        if (rover.getBoard().canRoverMovePosition(nextPositionX, nextPositionY)) {
            rover.setX(nextPositionX);
            rover.setY(nextPositionY);
        }

        return rover.getRoverState();
    }

    @Override
    public String toString() {
        return "WEST";
    }
}
