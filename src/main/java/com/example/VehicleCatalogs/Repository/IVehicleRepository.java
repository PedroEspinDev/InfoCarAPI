package com.example.VehicleCatalogs.Repository;

import com.example.VehicleCatalogs.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, Long> {
}
