package com.example.VehicleCatalogs.Controller;

import com.example.VehicleCatalogs.Entity.Vehicle;
import com.example.VehicleCatalogs.Service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/app")
@RestController
public class VehicleController {

    private final VehicleService vehicleService;

    @PostMapping("/add")
    ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle) {
        vehicleService.addVehicle(vehicle);
        return ResponseEntity.ok("Vehicle added");
    }
}
