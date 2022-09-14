package com.github.hryniuklukas.MeasurementDataProcessor.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "battery_modules")
@Getter
@Setter

public class BatteryModule {
  private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

  private String bcrReadedData;
  private String label;
  private String voltageJudgement;
  private LocalDate checkDate;
  private String serialNumber;
  private Long voltageDeviation;
  private Long mvDropDay;
  private Long mvPerDaySpec;

  private Long c1Dmm;
  private Long c2Dmm;
  private Long c3Dmm;
  private Long c4Dmm;
  private Long c5Dmm;
  private Long c6Dmm;
  private Long c7Dmm;
  private Long c8Dmm;
  private Long c9Dmm;
  private Long c10Dmm;

  private Long c1Bcr;
  private Long c2Bcr;
  private Long c3Bcr;
  private Long c4Bcr;
  private Long c5Bcr;
  private Long c6Bcr;
  private Long c7Bcr;
  private Long c8Bcr;
  private Long c9Bcr;
  private Long c10Bcr;
  private Long modVoltageBcr;

  private Long c1Difference;
  private Long c2Difference;
  private Long c3Difference;
  private Long c4Difference;
  private Long c5Difference;
  private Long c6Difference;
  private Long c7Difference;
  private Long c8Difference;
  private Long c9Difference;
  private Long c10Difference;

  private Long isolationVoltagePositive;
  private Long isolationVoltageNegative;

  private String judgement;

}
