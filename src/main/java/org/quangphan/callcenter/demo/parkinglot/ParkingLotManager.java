package org.quangphan.callcenter.demo.parkinglot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class ParkingLotManager {

    private List<Floor> floors = new ArrayList<>();

    public void addFloor() {
        floors.add(new Floor(floors.size() + 1));
    }

    public void checkAvailable(Vehicle vehicle) {
        floors.forEach(floor -> floor.listAvailable(vehicle)
                .ifPresentOrElse(
                        slots -> slots.forEach(slot -> System.out.println("Vehicle[" + vehicle.getNumberPlate() + "] can park at floor[" + floor.getLevel() + "] slot[" + slot.getNumber() + "]"))
                        ,
                        () -> System.out.println("Sorry Vehicle[" + vehicle.getNumberPlate() + "] no slot available for you")
                )
        );
    }

    public void parkVehicle(Vehicle vehicle) {
        AtomicReference<Slot> availableSlot = new AtomicReference<>();
        floors.forEach(floor -> {
            Optional<Slot> slot = floor.findFirst(vehicle);
            if (slot.isPresent()) {
                availableSlot.set(slot.get());
                return;
            }
        });
    }

}
