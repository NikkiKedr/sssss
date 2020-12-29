package org.example.groov.repos;

import org.example.groov.domain.Humidity;
import org.springframework.data.repository.CrudRepository;

public interface HumidityRepo extends CrudRepository<Humidity,Long> {
}
