package com.knylmz.tutorial.marsrover;

import com.knylmz.tutorial.marsrover.command.*;
import com.knylmz.tutorial.marsrover.state.*;

import java.util.HashMap;
import java.util.Map;

public class Rover {

    private Board board;
    private RoverState roverState;
    int x, y;

    private Map<ROVER_DIRECTION,RoverState> stateMap=new HashMap();
    {
        RoverState eastState=new StateImpl(ROVER_DIRECTION.E,new EastMove());
        RoverState westState=new StateImpl(ROVER_DIRECTION.W,new WestMove());
        RoverState northState=new StateImpl(ROVER_DIRECTION.N,new NorthMove());
        RoverState southState=new StateImpl(ROVER_DIRECTION.S,new SouthMove());

        eastState.setLeftState(southState);
        eastState.setRightState(northState);
        westState.setLeftState(northState);
        westState.setRightState(southState);
        northState.setLeftState(eastState);
        northState.setRightState(westState);
        southState.setLeftState(westState);
        southState.setRightState(eastState);

        stateMap.put(ROVER_DIRECTION.N, northState);
        stateMap.put(ROVER_DIRECTION.S, southState);
        stateMap.put(ROVER_DIRECTION.E, eastState);
        stateMap.put(ROVER_DIRECTION.W, westState);
    }



    public Rover(int x, int y, ROVER_DIRECTION roverDirection) {
        this.roverState = stateMap.get(roverDirection);
        this.x = x;
        this.y = y;
    } 

    public void process(RoverCommand command) {

        roverState = command.process();
    }


    public RoverState getRoverState() {
        return roverState;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
