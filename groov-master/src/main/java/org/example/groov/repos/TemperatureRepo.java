package org.example.groov.repos;

import org.example.groov.domain.Temperature;
import org.springframework.data.repository.CrudRepository;

public interface TemperatureRepo  extends CrudRepository<Temperature,Long> {
}
