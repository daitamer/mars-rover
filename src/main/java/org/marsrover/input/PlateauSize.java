package org.marsrover.input;

public class PlateauSize {

    private int width;
    private int length;

    public PlateauSize(int width, int length){
        if (width <=0 || length <=0){
            throw new IllegalArgumentException("Width and length cannot be equal or less than zero");
        }
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString(){
        return "Plateau width is: " + width + ", and Plateau length is: " + length;
    }

}

