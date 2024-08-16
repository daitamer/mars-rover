package org.marsrover.input;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    @DisplayName("Check parsePosition returns a valid output when passed a valid input")
    public void testParsePositionValidInput(){
        String input = "1 3 E";
        Position position = InputParser.parsePosition(input);
        assertEquals(1, position.getX());
        assertEquals(3, position.getY());
        assertEquals(CompassDirection.E, position.getFacing());

        String input2 = "2 3 W";
        Position position2 = InputParser.parsePosition(input2);
        assertEquals(2, position2.getX());
        assertEquals(3, position2.getY());
        assertEquals(CompassDirection.W, position2.getFacing());
    }

    @Test
    @DisplayName("Assert parsePosition throws an error when passed an invalid position")
    public void testParsePositionInvalidInput(){
        String input = "1 2 X";
        try {
           InputParser.parsePosition(input);
        } catch (IllegalArgumentException e){
            assertEquals("This is not a valid position.", e.getMessage());
        }
    }


    @Test
    @DisplayName("Assert parseInstruction returns correct values when passed valid input")
    public void testParseInstructionValidInput(){
        String input = "RMML";
        List<Instruction> instructions = InputParser.parseInstruction(input);
        assertEquals(Instruction.R, instructions.get(0));
        assertEquals(Instruction.M, instructions.get(1));
        assertEquals(Instruction.M, instructions.get(2));
        assertEquals(Instruction.L, instructions.get(3));
    }

//    test instruction invalid input

    @Test
    @DisplayName("Assert parseInstruction throws an error when passed invalid input")
    public void testParseInstructionInvalidInput(){
        String input = "JLMRMM";
        try {
            InputParser.parseInstruction(input);
        } catch (IllegalArgumentException e){
           assertEquals("This is not a valid input", e.getMessage());
        }

        String input2 = "RMM6";
        try {
            InputParser.parseInstruction(input2);
        } catch (IllegalArgumentException e) {
            assertEquals("This is not a valid input", e.getMessage());
        }
    }

    @Test
    @DisplayName("Assert parsePlateauSizeValidInput returns correct values when passed valid input")
    public void testParsePlateauSizeValidInput(){
        String input = "5 5";
        PlateauSize plateauSize = InputParser.parsePlateauSize(input);
        assertEquals(5, plateauSize.getWidth());
        assertEquals(5, plateauSize.getLength());

        String input2 = "10 15";
        PlateauSize plateauSize2 = InputParser.parsePlateauSize(input2);
        assertEquals(10, plateauSize2.getWidth());
        assertEquals(15, plateauSize2.getLength());
    }

    @Test
    @DisplayName("Assert parsePlateauSizeInvalidInput throws an error when passed invalid input")
    public void testParsePlateauSizeInvalidInput(){
        String input ="-5 10";
        try {
            InputParser.parsePlateauSize(input);
        } catch (IllegalArgumentException e){
            assertEquals("Width and length must be higher than zero", e.getMessage());
        }

        String input2 = "3 0";
        try {
            InputParser.parsePlateauSize(input2);
        } catch (IllegalArgumentException e){
            assertEquals("Width and length must be higher than zero", e.getMessage());
        }
    }

// add tests for direction


}