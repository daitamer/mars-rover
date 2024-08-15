package org.marsrover.input;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    @DisplayName("Check parsePosition throws an error when passed an invalid direction")
    public void testParsePositionInvalidInput(){
        String input = "1 2 X";
        try {
           InputParser.parsePosition(input);
        } catch (IllegalArgumentException e){
            assertEquals("This is not a valid position.", e.getMessage());
        }

    }



}