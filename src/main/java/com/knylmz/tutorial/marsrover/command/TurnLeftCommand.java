package com.knylmz.tutorial.marsrover.command;

import com.knylmz.tutorial.marsrover.Rover;
import com.knylmz.tutorial.marsrover.state.RoverState;

public class TurnLeftCommand implements RoverCommand {

    private Rover rover;

    public TurnLeftCommand(Rover rover) {
        this.rover = rover;
    }

    public RoverState process() {
        return rover.getRoverState().turnLeft(rover);
    }
}
