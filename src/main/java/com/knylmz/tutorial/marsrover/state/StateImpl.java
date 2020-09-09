package com.knylmz.tutorial.marsrover.state;

import com.knylmz.tutorial.marsrover.ROVER_DIRECTION;
import com.knylmz.tutorial.marsrover.Rover;

public class StateImpl implements RoverState {


    private ROVER_DIRECTION roverDirection;
    private RoverState leftState;
    private RoverState rightState;
    private Movable movable;

    public StateImpl(ROVER_DIRECTION roverDirection, Movable movable) {
        this.roverDirection = roverDirection;
        this.movable = movable;
    }

    public RoverState turnLeft(Rover rover) {
        return leftState;
    }

    public RoverState turnRight(Rover rover) {
        return rightState;
    }

    public RoverState move(Rover rover) {
        return movable.move(rover);
    }


    public void setLeftState(RoverState leftState) {
        this.leftState = leftState;
    }


    public void setRightState(RoverState rightState) {
        this.rightState = rightState;
    }

    public ROVER_DIRECTION getRoverDirection() {
        return roverDirection;
    }

    @Override
    public String toString() {
        return "StateImpl{" +
                "roverDirection=" + roverDirection  +
                '}';
    }
}
