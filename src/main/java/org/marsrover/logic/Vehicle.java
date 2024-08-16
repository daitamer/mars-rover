package org.marsrover.logic;

import org.marsrover.input.Position;

public class Vehicle {

    private VehicleType vehicle;
    private Position position;

    public Vehicle(VehicleType vehicle, Position position){
        this.vehicle = vehicle;
        this.position = position;
    }

    public VehicleType getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleType vehicle) {
        this.vehicle = vehicle;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


}
