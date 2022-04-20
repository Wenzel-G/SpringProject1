package com.WGQuintrix.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.WGQuintrix.helloworld.entity.Car;

@RestController
public class HelloController {
	
	
	
	Car car1 = new Car("Toyota", "Camry", 2000);
	Car car2 = new Car("Ford", "Mustang", 1969);
	Car car3 = new Car("Lambourgini", "Murciélago", 2020);
	Car car4 = new Car("Toyota", "Corolla", 2008);
	
	Car carArray[] = {car1, car2, car3, car4};
	
	List<Car> carList = new ArrayList<Car>(Arrays.asList(carArray));
	
	@GetMapping("/cars")
	public List<Car> getCars() {
		
		return carList;
	}
	
	@GetMapping("/cars/make")
	public List<Car> getMake(@RequestParam String make) {
		
		List<Car> makeList = carList.stream().filter(p -> p.getMake().equals(make)).collect(Collectors.toList());
		
		return  makeList;
	}
	
	@PostMapping("/cars/addCarPost")
	@ResponseBody
	public List<Car> addCar(@RequestBody Car car){
		
		carList.add(car);
		
		return carList;
	}
	
	@GetMapping("/cars/addCar")
	public List<Car> addCar(@RequestParam String make, @RequestParam String model, @RequestParam int year){
		  
		Car toAdd = new Car(make, model, year);
		carList.add(toAdd);
		return carList;
	}
	
	
}
