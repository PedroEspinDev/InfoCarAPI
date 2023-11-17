package com.example.VehicleCatalogs.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String model;
    private String brand;
    private String type;
    private String engine;
    private String transmission;
    private String fuel;
    private Date year;
    private BigDecimal price;
    private int numberOfSeats;
}
