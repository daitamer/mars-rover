package org.marsrover.logic;

import org.marsrover.input.Position;

public class Planet implements Navigable{

    private String name;
    private int size;
    private boolean isNavigable;

    public Planet (String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public boolean isNavigable() {
       return isNavigable;
    }
}
