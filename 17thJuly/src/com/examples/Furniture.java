package com.examples;

public class Furniture {

	class cot{
		double price;
	}
	
	class chair{
		double price;		
	}
	
	class diningTable{
		double price;
	}

	public double disc (cot c) {
		return c.price*0.1;
	}
	
	public double disc (chair c) {
		return c.price*0.1;
	}
	
	public double disc (diningTable d) {
		return d.price*0.1;
	}
}
 