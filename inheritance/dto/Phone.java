package com.xworkz.inheritance.dto;

public class Phone {
	public String name;
	public long price;
	public float height;
	public byte width;
	public String color;
	
	public Phone() {
		System.out.println("Invoking Phone class");
	}

	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public long price(long price) {
		this.price=price;
		return price;
	}
	
	public float height(float height) {
		this.height=height;
		return height;
	}
	
	public byte width(byte width) {
		this.width=width;
		return width;
	}
	
	public String name(String name) {
		this.name=name;
		return name;
	}
}

