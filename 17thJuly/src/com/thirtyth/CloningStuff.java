package com.thirtyth;

class Places implements Cloneable{
	String name;
	String country;
	long population;
	/**
	 * @param name
	 * @param country
	 * @param population
	 */
	public Places(String name, String country, long population) {
		super();
		this.name = name;
		this.country = country;
		this.population = population;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class CloningStuff {
	public static void main(String[] args) throws CloneNotSupportedException {

		Places p1 = new Places("Washington","USA",100000);
		
		Places p2 = (Places) p1.clone();
		
		System.out.println("P1: tostring: "+p1.toString());
		System.out.println("P2: tostring: "+p2.toString());
		
		System.out.println(" P1 "+ p1.country + "  "+p1.name + "  "+ p1.population); 
		System.out.println(" P2 "+ p2.country + "  "+p2.name + "  "+ p2.population); 
		
		p1.country="India";
		p1.name="Delhi";
		p1.population=2000000;
		
		System.out.println("P1: tostring: "+p1.toString());
		System.out.println(" P1 "+ p1.country + "  "+p1.name + "  "+ p1.population);
	}
}
