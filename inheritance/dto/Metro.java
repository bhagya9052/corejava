package com.xworkz.inheritance.dto;

public class Metro {
	public String station;
	public int trains;
	public String color;
	public int workers;
	public boolean lift;
	
	public Metro() {
		System.out.println("Invoking Metro class");
	}
	
	public String station(String station) {
		this.station=station;
		return station;
	}
	
	public int trains(int trains) {
		this.trains=trains;
		return trains;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public boolean lift(boolean lift) {
		this.lift=lift;
		return lift;
	}
	
	public int workers(int workers) {
		this.workers=workers;
		return workers;
	}
}

