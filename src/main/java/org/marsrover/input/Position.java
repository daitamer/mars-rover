package org.marsrover.input;

public class Position {

    private int x;
    private int y;
    private CompassDirection facing;

    public Position(int x, int y, CompassDirection facing){
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public CompassDirection getFacing() {
        return facing;
    }

    public void setFacing(CompassDirection facing) {
        this.facing = facing;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString(){
        return "Position x is " + x + ". Position y is " + y + ". Rover is facing " + getFacing() + ".";
    }

}