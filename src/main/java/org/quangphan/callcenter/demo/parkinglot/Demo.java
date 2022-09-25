package org.quangphan.callcenter.demo.parkinglot;

public class Demo {

    public static void main(String[] args) {

        ParkingLotManager parkingLotManager = new ParkingLotManager();

        parkingLotManager.addFloor();
        parkingLotManager.addFloor();
        parkingLotManager.addFloor();

        Vehicle toyotaCorola = new Vehicle("Corola Altis 1", VehicleSize.Large);
        parkingLotManager.checkAvailable(toyotaCorola);


    }

}
