package com.demo.api.persistanceapi.repository;

import com.demo.api.persistanceapi.model.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, String> {
}
