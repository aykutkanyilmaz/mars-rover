package com.knylmz.tutorial.marsrover.state;

import com.knylmz.tutorial.marsrover.Rover;

public interface Movable {
     RoverState move(Rover rover);
}
