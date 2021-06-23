package com.demo.api.persistanceapi.controller;

import com.demo.api.persistanceapi.model.City;
import com.demo.api.persistanceapi.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CityController {

	@Autowired
	private CityRepository cityRepository;

	@PutMapping("/api/persistence/addCity/{city}")
	public ResponseEntity<String> addCity(@PathVariable String city) {
		if (city != null && !city.isBlank()) {
			cityRepository.save(new City(city));
			return new ResponseEntity<String>("success", HttpStatus.OK);
		}
		return new ResponseEntity<String>("Invalid Parameter", HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/api/persistence/getCities")
	public ResponseEntity<List<City>> getCities() {
		List<City> listOfCities = new ArrayList<>();
		cityRepository.findAll().forEach((e) -> { listOfCities.add(e); } );
		return new ResponseEntity<List<City>>(listOfCities, HttpStatus.OK);
	}
}
