package com.knylmz.tutorial.marsrover.state.command;

import com.knylmz.tutorial.marsrover.Rover;
import com.knylmz.tutorial.marsrover.state.RoverState;

public class SouthMove implements Movable {

    public RoverState move(Rover rover) {
        int nextPositionX = rover.getX();
        int nextPositionY = rover.getY() - 1;

        if (rover.getBoard().canRoverMovePosition(nextPositionX, nextPositionY)) {
            rover.setX(nextPositionX);
            rover.setY(nextPositionY);
        }
        return rover.getRoverState();
    }

}
