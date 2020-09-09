package com.knylmz.tutorial.marsrover.state.command;

import com.knylmz.tutorial.marsrover.Rover;
import com.knylmz.tutorial.marsrover.state.RoverState;

public class EastMove implements Movable {

    public RoverState move(Rover rover) {

        int nextPositionX = rover.getX() - 1;
        int nextPositiony = rover.getY();

        if (rover.getBoard().canRoverMovePosition(nextPositionX, nextPositiony)) {
            rover.setX(nextPositionX);
        }

        return rover.getRoverState();
    }

    @Override
    public String toString() {
        return "EAST";
    }
}
