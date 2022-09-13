package com.github.hryniuklukas.MeasurementDataProcessor.model;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "battery_modules")
@Getter
@Setter

public class BatteryModule {
private @Id @GeneratedValue(strategy= GenerationType.IDENTITY) Long id;
private String serialNumber;

}
