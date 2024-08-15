package org.marsrover;

import org.marsrover.input.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

    }
}