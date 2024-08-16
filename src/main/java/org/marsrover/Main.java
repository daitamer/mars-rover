package org.marsrover;

import org.marsrover.input.*;
import org.marsrover.logic.Plateau;
import org.marsrover.logic.Rover;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    String positionInput = "1 2 N";
        Position startingPosition = InputParser.parsePosition(positionInput);
        System.out.println(startingPosition);

    String plateauInput = "5 5";
    PlateauSize plateauSize = InputParser.parsePlateauSize(plateauInput);
        System.out.println("Plateau size is: width = " + plateauSize.getWidth() + ", length = " + plateauSize.getLength() + ".");

    String instructionsInput = "LMRMM";
    List<Instruction> instructions = InputParser.parseInstruction(instructionsInput);
        System.out.println(instructions);

    String directionInput = "N";
    CompassDirection direction = InputParser.parseDirection(directionInput);
    System.out.println("Direction is now: " + direction);

    PlateauSize size = new PlateauSize(5, 5);
    Plateau plateau = new Plateau(size);

    System.out.println(plateau);

    Position position = new Position(1, 2, CompassDirection.N);
        System.out.println(position);
    Rover rover = new Rover(position, CompassDirection.N);
        System.out.println(rover);
    rover.moveForward();

        System.out.println("Before rotating right: " + rover.getPosition());
        System.out.println(rover.getFacing());
    rover.rotateRight();
        System.out.println(rover);
        System.out.println("After rotating right: " + rover.getPosition());
        System.out.println(rover.getFacing());

    }
}