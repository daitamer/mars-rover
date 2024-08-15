package org.marsrover;

import org.marsrover.input.InputParser;
import org.marsrover.input.Position;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    String positionInput = "1 2 N";

        Position startingPosition = InputParser.parsePosition(positionInput);
        System.out.println(startingPosition);
    }
}