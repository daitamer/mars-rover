package org.marsrover.logic;

import org.marsrover.input.Position;

public interface Controllable {

    void rotateRight();
    void rotateLeft();
    void moveForward();

    Position getPosition();
}
