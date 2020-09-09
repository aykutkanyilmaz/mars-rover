package com.knylmz.tutorial.marsrover.command;

import com.knylmz.tutorial.marsrover.state.RoverState;

public interface RoverCommand {
    RoverState process();
}
