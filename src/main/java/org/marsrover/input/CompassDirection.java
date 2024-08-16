package org.marsrover.input;

public enum CompassDirection {
    N,
    E,
    S,
    W;

    public CompassDirection turnLeft(){
        switch(this){
            case N:
                return W;
            case W:
                return S;
            case S:
                return E;
            case E:
                return N;
            default:
                throw new IllegalArgumentException("Unexpected input.");
        }
    }

    public CompassDirection turnRight(){
        switch(this){
            case N:
                return E;
            case E:
                return S;
            case S:
                return W;
            case W:
                return N;
            default:
                throw new IllegalArgumentException("Unexpected input");
        }
    }


}
