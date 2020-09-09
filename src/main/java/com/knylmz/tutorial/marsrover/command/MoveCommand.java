package com.knylmz.tutorial.marsrover.command;

import com.knylmz.tutorial.marsrover.Rover;
import com.knylmz.tutorial.marsrover.state.RoverState;

public class MoveCommand implements RoverCommand {

    private Rover rover;

    public MoveCommand(Rover rover) {
        this.rover = rover;
    }

    public RoverState process() {
        return rover.getRoverState().move(rover);
    }
}
