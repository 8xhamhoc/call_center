package org.quangphan.callcenter.demo.parkinglot;

public class VehicleAlreadyParkException extends RuntimeException {

    public VehicleAlreadyParkException() {
    }

    public VehicleAlreadyParkException(String message) {
        super(message);
    }
}
