package com.example.demo.Service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Bus;
import com.example.demo.Repository.BusRepository;
@Service
public class BusService {
	@Autowired
	private BusRepository busRepository;
	public void addBus(Bus bus) {
		// TODO Auto-generated method stub
		busRepository.save(bus);
	}
	public void deletebus(int id) {
		// TODO Auto-generated method stub
		busRepository.deleteById(id);
		
	}
	public void updateBus(String engineNumber, Bus bus1) {
		// TODO Auto-generated method stub
		Bus bus = busRepository.findByEngineNumber(engineNumber).orElse(null);
        if (bus!=null) {
        	bus.setBusName(bus1.getBusName());
        	bus.setBusNumber(bus1.getBusNumber());
        	bus.setBusType(bus1.getBusType());
        	bus.setRegNo(bus1.getRegNo());
        	bus.setTotalSeats(bus1.getTotalSeats());
            busRepository.save(bus);
        }
		
	}}
