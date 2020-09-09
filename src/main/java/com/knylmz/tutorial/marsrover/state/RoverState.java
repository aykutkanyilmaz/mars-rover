package com.knylmz.tutorial.marsrover.state;

import com.knylmz.tutorial.marsrover.Rover;
import com.knylmz.tutorial.marsrover.state.strategy.Movable;

public interface RoverState extends Movable {

    RoverState turnLeft(Rover rover);

    RoverState turnRight(Rover rover);

    RoverState move(Rover rover);

    void setLeftState(RoverState leftState);


    void setRightState(RoverState rightState);

    ROVER_DIRECTION getRoverDirection();

}
