package com.demo.api.sampleapi.controller;

import com.demo.api.sampleapi.common.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static com.demo.api.sampleapi.common.Constants.API_VERSION;

@RestController
public class WeatherController {

	private static final Logger LOGGER = LoggerFactory.getLogger(WeatherController.class);

	@GetMapping(value = "/api/web/"+ API_VERSION +"/getConfiguredCities")
	public ResponseEntity<List<String>> getConfiguredCities() {
		List<String> cities = new ArrayList<>();
		cities.add("Southbank");
		cities.add("Melbourne");
		return new ResponseEntity<>(cities, HttpStatus.OK);
	}

	@PutMapping(value = "/api/web/"+ API_VERSION +"/addCityToConfiguration/{city}")
	public ResponseEntity<String> addCityToConfiguration(@PathVariable String city) {
		LOGGER.info("Adding city to the configuration {}", city);
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
}
