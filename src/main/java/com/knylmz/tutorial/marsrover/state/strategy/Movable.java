package com.knylmz.tutorial.marsrover.state.strategy;

import com.knylmz.tutorial.marsrover.Rover;
import com.knylmz.tutorial.marsrover.state.RoverState;

public interface Movable {
     RoverState move(Rover rover);
}
