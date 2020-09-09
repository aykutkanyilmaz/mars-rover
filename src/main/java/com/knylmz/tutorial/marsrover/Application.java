package com.knylmz.tutorial.marsrover;


import com.knylmz.tutorial.marsrover.command.MoveCommand;
import com.knylmz.tutorial.marsrover.command.RoverReciever;
import com.knylmz.tutorial.marsrover.command.TurnLeftCommand;
import com.knylmz.tutorial.marsrover.command.TurnRigthCommand;

public class Application {

    public static void main(String[] args) {

        Rover r = new Rover(1, 2, ROVER_DIRECTION.N);
        r.setBoard(new Board(5, 5));

        String command = "L M L M L M L M M";

        process(r, command);
        System.out.println(r.getX() + " -  " + r.getY() + " " + r.getRoverState().toString());

    }

    public static void process(Rover r, String command) {
        String[] commands = command.split(" ");
        for (String c : commands) {
            System.out.println(r.getX() + " -  " + r.getY() + " " + r.getRoverState().toString());
            System.out.println("c: " + c);
            if ("L".equals(c)) {
                r.process(new TurnLeftCommand(r));
            } else if ("R".equals(c)) {
                r.process(new TurnRigthCommand(r));
            } else if ("M".equals(c)) {
                r.process(new MoveCommand(r));
            }
        }

    }

}
