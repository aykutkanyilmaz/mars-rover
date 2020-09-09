package com.knylmz.tutorial.marsrover.state.strategy;

import com.knylmz.tutorial.marsrover.Rover;
import com.knylmz.tutorial.marsrover.state.RoverState;

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
