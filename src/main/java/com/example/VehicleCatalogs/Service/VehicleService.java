package com.example.VehicleCatalogs.Service;

import com.example.VehicleCatalogs.Entity.Vehicle;
import com.example.VehicleCatalogs.Repository.IVehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class VehicleService {
    private final IVehicleRepository vehicleRepository;

    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    public Optional<Vehicle> carById(Long id) {
        Optional<Vehicle> optionalVehicle = vehicleRepository.findById(id);
        return optionalVehicle;
    }

    public List<Vehicle> getAllCars() {
        return vehicleRepository.findAll();
    }

    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }

    public Optional carByModel(String model) {
        Optional optionalVehicle = Optional.of(vehicleRepository.getByModelIgnoreCase(model));
        return optionalVehicle;
    }
}
