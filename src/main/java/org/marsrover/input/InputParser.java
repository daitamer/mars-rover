package org.marsrover.input;

import java.util.ArrayList;
import java.util.List;

public class InputParser {

    public static Position parsePosition(String input){
        String[] userInput = input.split(" ");
        int x = Integer.parseInt(userInput[0]);
        int y = Integer.parseInt(userInput[1]);
        CompassDirection direction = CompassDirection.valueOf(userInput[2]);
        return new Position(x, y, direction);
    }

    public static List<Instruction> parseInstruction(String input){
        List<Instruction> instructions = new ArrayList<>();
        for (char c : input.toCharArray()){
            instructions.add(Instruction.valueOf(String.valueOf(c)));
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
        return new PlateauSize(width, length);
    }

}
