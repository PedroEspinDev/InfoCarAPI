package com.example.VehicleCatalogs.Controller;

import com.example.VehicleCatalogs.Entity.Vehicle;
import com.example.VehicleCatalogs.Service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/info")
@RestController
public class VehicleController {

    private final VehicleService vehicleService;

    @PostMapping("/addCar")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.addVehicle(vehicle);
        return ResponseEntity.ok("Vehicle added");
    }

    @GetMapping("/carById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> carById(@PathVariable Long id) {
        Optional optionalId = vehicleService.carById(id);
        return new ResponseEntity(optionalId, HttpStatus.OK);
    }

    @GetMapping("/allCars")
    public ResponseEntity<List<Vehicle>> allCars() {
        Optional<List<Vehicle>> optionalCars = Optional.of(vehicleService.getAllCars());
        return new ResponseEntity(optionalCars, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteVehicle(@PathVariable Long id) {
        vehicleService.deleteVehicle(id);
        return ResponseEntity.ok("Vehicle deleted");
    }

    @GetMapping("/carModel/{model}")
    public ResponseEntity<String> carByModel(@PathVariable String model) {
        Optional optionaModel = vehicleService.carByModel(model);
        return new ResponseEntity(optionaModel, HttpStatus.OK);
    }
}
