package com.example.VehicleCatalogs.Service;

import com.example.VehicleCatalogs.Entity.Vehicle;
import com.example.VehicleCatalogs.Repository.IVehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class VehicleService {
    private final IVehicleRepository vehicleRepository;

    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

}
