package org.marsrover.logic;

import org.marsrover.input.PlateauSize;

public class Plateau implements Navigable{

    private PlateauSize size;

    public Plateau(PlateauSize size){
        this.size = size;
    }

    @Override
    public boolean isNavigable() {
        return size.getWidth() > 0 && size.getLength() > 0;
    }

    public PlateauSize getSize() {
        return size;
    }

    public void setSize(PlateauSize size) {
        this.size = size;
    }

    //size; obstacles?
    @Override
    public String toString(){
        return "Plateau dimentions. " + size;
    }

}
