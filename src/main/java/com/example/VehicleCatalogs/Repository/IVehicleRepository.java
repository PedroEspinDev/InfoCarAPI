package com.example.VehicleCatalogs.Repository;

import com.example.VehicleCatalogs.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, Long> {
    @Query("SELECT v FROM Vehicle v WHERE LOWER(v.model) = LOWER(:model)")
    Optional<Vehicle> getByModelIgnoreCase(@Param("model") String model);
}
