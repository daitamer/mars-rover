package org.marsrover.logic;

import org.marsrover.input.CompassDirection;
import org.marsrover.input.Position;

public class Rover extends Vehicle implements Controllable{

    private CompassDirection facing;

  public Rover(Position position, CompassDirection facing){
      super(VehicleType.ROVER, position);
      this.facing = facing;
  }

    public CompassDirection getFacing() {
        return facing;
    }

    public void setFacing(CompassDirection facing) {
        this.facing = facing;
    }

//    rotate right, left and move forward (R, L M Instruction);
//new position;
//    check for obstacles;

  public void rotateRight(){
     facing = facing.turnRight();
     getPosition().setFacing(facing);
  }

  public void rotateLeft(){
      facing = facing.turnLeft();
      getPosition().setFacing(facing);
  }

  public void moveForward(){
        int nextX = getPosition().getX();
        int nextY = getPosition().getY();
        switch(facing){
            case N:
                nextY++;
                break;
            case E:
                nextX++;
                break;
            case S:
                nextY--;
                break;
            case W:
                nextX--;
                break;
        }
        Position newPosition = new Position(nextX, nextY, facing);
        setPosition(newPosition);
  }

  @Override
    public String toString(){
      return "The rover is facing " + facing;
  }

}
