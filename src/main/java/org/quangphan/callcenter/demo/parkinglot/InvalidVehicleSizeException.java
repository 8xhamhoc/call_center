package org.quangphan.callcenter.demo.parkinglot;

public class InvalidVehicleSizeException extends RuntimeException {

    public InvalidVehicleSizeException() {
    }

    public InvalidVehicleSizeException(String message) {
        super(message);
    }
}
