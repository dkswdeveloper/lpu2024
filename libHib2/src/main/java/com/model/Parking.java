package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Parking {

	@Id
	@GeneratedValue
	@Column(name="parkingid")
	private int parkingId;
	private int floornum;
	public int getParkingId() {
		return parkingId;
	}
	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}
	public int getFloornum() {
		return floornum;
	}
	public void setFloornum(int floornum) {
		this.floornum = floornum;
	}
	@Override
	public String toString() {
		return "Parking [parkingId=" + parkingId + ", floornum=" + floornum + "]";
	}
	
}
