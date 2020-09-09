package com.knylmz.tutorial.marsrover.state;

import com.knylmz.tutorial.marsrover.ROVER_DIRECTION;
import com.knylmz.tutorial.marsrover.Rover;

public interface RoverState extends Movable {

    RoverState turnLeft(Rover rover);

    RoverState turnRight(Rover rover);

    RoverState move(Rover rover);

    void setLeftState(RoverState leftState);


    void setRightState(RoverState rightState);

    ROVER_DIRECTION getRoverDirection();

}
