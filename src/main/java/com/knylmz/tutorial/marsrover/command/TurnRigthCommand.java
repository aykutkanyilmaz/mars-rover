package com.knylmz.tutorial.marsrover.command;

import com.knylmz.tutorial.marsrover.Rover;
import com.knylmz.tutorial.marsrover.state.RoverState;

public class TurnRigthCommand implements RoverCommand {
    private Rover rover;

    public TurnRigthCommand(Rover rover) {
        this.rover = rover;
    }

    public RoverState process() {
        return rover.getRoverState().turnRight(rover);

    }
}
