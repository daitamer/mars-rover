package org.marsrover.input;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassDirectionTest {

    @Test
    void turnLeft() {
        assertEquals(CompassDirection.N, CompassDirection.E.turnLeft());
        assertEquals(CompassDirection.W, CompassDirection.N.turnLeft());
        assertEquals(CompassDirection.S, CompassDirection.W.turnLeft());
        assertEquals(CompassDirection.E, CompassDirection.S.turnLeft());
    }

    @Test
    void turnRight() {
        assertEquals(CompassDirection.N, CompassDirection.W.turnRight());
        assertEquals(CompassDirection.E, CompassDirection.N.turnRight());
        assertEquals(CompassDirection.S, CompassDirection.E.turnRight());
        assertEquals(CompassDirection.W, CompassDirection.S.turnRight());
    }



//    public CompassDirection turnRight(){
//        switch(this){
//            case N:
//                return E;
//            case E:
//                return S;
//            case S:
//                return W;
//            case W:
//                return N;
//            default:
//                throw new IllegalArgumentException("Unexpected input");
//        }
//    }


}