package com.xworkz.inheritance;

import com.xworkz.inheritance.dto.Lotus;
import com.xworkz.inheritance.dto.Flower;

public class Testflower {
	public static void main(String []args) {
		
		Lotus lotus = new Lotus();
		System.out.println(lotus.type("flower"));
		System.out.println(lotus.petals(10));
		System.out.println(lotus.color("pink"));
		System.out.println(lotus.price(50));
		System.out.println(lotus.beautiful(true));
		
		Flower flower = new Flower();
		
		System.out.println(flower.name("rose"));
		System.out.println(flower.types(50));
		System.out.println(flower.height((byte)20));
		System.out.println(flower.width(30));
		System.out.println(flower.goodsmell(true));
		
		
		
		
	}
}

