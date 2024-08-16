package org.marsrover.logic;

public class Mars extends Planet{

    public Mars(String name, int size) {
        super(name, size);
    }

    @Override
    public boolean isNavigable() {
        return true;
    }
}
