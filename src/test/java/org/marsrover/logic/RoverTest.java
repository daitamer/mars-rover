package org.marsrover.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.marsrover.input.CompassDirection;
import org.marsrover.input.InputParser;
import org.marsrover.input.Position;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    Rover rover;

    @BeforeEach
    void setUp(){
        Position position = new Position(0, 0, CompassDirection.N);
        rover = new Rover(position, CompassDirection.N);
    }

    @Test
    @DisplayName("Assert rotateLeft method returns a correct value when passed a valid input")
    public void testRotateLeftValidInput(){

        assertEquals(CompassDirection.N, rover.getFacing());
        rover.rotateLeft();
        assertEquals(CompassDirection.W, rover.getFacing());
        rover.rotateLeft();
        assertEquals(CompassDirection.S, rover.getFacing());
        rover.rotateLeft();
        assertEquals(CompassDirection.E, rover.getFacing());

    }

    @Test
    @DisplayName("Assert rotateRight method returns a correct value when passed a valid input")
    public void testRotateRightValidInput(){

        assertEquals(CompassDirection.N, rover.getFacing());
        rover.rotateRight();
        assertEquals(CompassDirection.E, rover.getFacing());
        rover.rotateRight();
        assertEquals(CompassDirection.S, rover.getFacing());
        rover.rotateRight();
        assertEquals(CompassDirection.W, rover.getFacing());
        rover.rotateRight();
        assertEquals(CompassDirection.N, rover.getFacing());

    }

//implement test for move forward in each direction;

//    public void moveForward(){
//        int nextX = getPosition().getX();
//        int nextY = getPosition().getY();
//        switch(facing){
//            case N:
//                nextY++;
//                break;
//            case E:
//                nextX++;
//                break;
//            case S:
//                nextY--;
//                break;
//            case W:
//                nextX--;
//                break;
//        }
//        Position newPosition = new Position(nextX, nextY, facing);
//        setPosition(newPosition);
//    }

}