package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Bus;
import com.example.demo.Service.BusService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BusController {
	@Autowired
	private BusService busService;
	@PostMapping("/bus")
	public ResponseEntity<?> createCountry(@RequestBody Bus bus) {
		busService.addBus(bus);	
		return ResponseEntity.ok(bus);		
	}
	@DeleteMapping("/bus/{id}")
	public ResponseEntity<Bus> deleteUser(@PathVariable int id) {
		busService.deletebus(id);
				return new ResponseEntity<>(HttpStatus.OK);
		}
	@PutMapping("/bus/{engineNumber}") 
	public Bus updateBus(@PathVariable String engineNumber,@RequestBody Bus bus ) {
		busService.updateBus(engineNumber,bus);
		return bus;
		}
}
