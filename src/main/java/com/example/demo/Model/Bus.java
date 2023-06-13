package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bus {
	@Id
	@GeneratedValue
	int busId;
	String busNumber;
	String regNo;
	String engineNumber;
	String busType;
	String busName;
	String totalSeats;
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(String totalSeats) {
		this.totalSeats = totalSeats;
	}
	public Bus(int busId, String busNumber, String regNo, String engineNumber, String busType, String busName,
			String totalSeats) {
		super();
		this.busId = busId;
		this.busNumber = busNumber;
		this.regNo = regNo;
		this.engineNumber = engineNumber;
		this.busType = busType;
		this.busName = busName;
		this.totalSeats = totalSeats;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
