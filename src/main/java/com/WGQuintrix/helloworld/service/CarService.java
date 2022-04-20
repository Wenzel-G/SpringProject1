package com.WGQuintrix.helloworld.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;

import com.WGQuintrix.helloworld.entity.Car;

@Configuration
public class CarService {
	
	Car car1 = new Car("Toyota", "Camry", 2000);
	Car car2 = new Car("Ford", "Mustang", 1969);
	Car car3 = new Car("Lambourgini", "Murciélago", 2020);
	Car car4 = new Car("Toyota", "Corolla", 2008);
	
	Car carArray[] = {car1, car2, car3, car4};
	
	
	List<Car> carList = new ArrayList<Car>(Arrays.asList(carArray));
	
	
	public List<Car> getCars(){
		return carList;
	}


	public List<Car> getMake(String make) {
		
			
	List<Car> makeList = carList.stream().filter(p -> p.getMake().equals(make)).collect(Collectors.toList());
			
	return makeList;
	
	}
	
	public List<Car> addCar(Car car){
		
		carList.add(car);
		
		return carList;
	}
	

}
