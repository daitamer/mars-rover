package org.marsrover.input;

import java.util.ArrayList;
import java.util.List;

public class InputParser {

    public static Position parsePosition(String input){
        String[] userInput = input.split(" ");
        int x = Integer.parseInt(userInput[0]);
        int y = Integer.parseInt(userInput[1]);
        CompassDirection direction;
        try {
            direction = CompassDirection.valueOf(userInput[2]);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("This is not a valid position.");
        }

        return new Position(x, y, direction);
    }

    public static List<Instruction> parseInstruction(String input){
        List<Instruction> instructions = new ArrayList<>();
        for (char c : input.toUpperCase().toCharArray()){
            if (c == 'R' || c == 'L' || c == 'M') {
                instructions.add(Instruction.valueOf(String.valueOf(c)));
            } else {
                throw new IllegalArgumentException("This is not a valid input");
            }
        }

        if (instructions.isEmpty()){
            throw new IllegalArgumentException("Instructions cannot be empty");
        }

        return instructions;

    }

    public static CompassDirection parseDirection(String input){

        try {
            return CompassDirection.valueOf(input);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("This is not a valid direction.");
        }

    }

    public static PlateauSize parsePlateauSize (String input){
        String[] userInput = input.split(" ");
        int width = Integer.parseInt(userInput[0]);
        int length = Integer.parseInt(userInput[1]);

        if (width <= 0 || length <= 0){
            throw new IllegalArgumentException("Width and length must be higher than zero");
        }

        try{
            return new PlateauSize(width, length);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("This is not a valid size");
        }

    }

}
