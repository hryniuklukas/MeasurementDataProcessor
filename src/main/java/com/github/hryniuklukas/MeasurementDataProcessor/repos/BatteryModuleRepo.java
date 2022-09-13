package com.github.hryniuklukas.MeasurementDataProcessor.repos;

import com.github.hryniuklukas.MeasurementDataProcessor.model.BatteryModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatteryModuleRepo extends JpaRepository<BatteryModule, Long> {
}
