package com.WGQuintrix.helloworld.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.WGQuintrix.helloworld.entity.Car;
import com.WGQuintrix.helloworld.service.CarService;

@RestController
public class HelloController {
	
	
	@Autowired
	private CarService carService;
	

	
	@GetMapping("/cars")
	public List<Car> getCars() {
		
		return carService.getCars();
	}
	
	@GetMapping("/cars/make")
	public List<Car> getMake(@RequestParam String make) {
		
		return  carService.getMake(make);
	}
	
	@PostMapping("/cars/addCarPost")
	@ResponseBody
	public List<Car> addCar(@RequestBody Car car){
		
		return carService.addCar(car);
	}
	
	@GetMapping("/cars/addCar")
	public List<Car> addCar(@RequestParam String make, @RequestParam String model, @RequestParam int year){
		  
		Car toAdd = new Car(make, model, year);
		return carService.addCar(toAdd);
	}
	
	
}
