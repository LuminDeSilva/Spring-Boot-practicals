package vau.fas.dps.it.Model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Vehicle {
	@Id
	private int id;
	private String maker;
	private String model;
	private int  year;

}
