package com.examples;

public class TestCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setCarDetails("alto", 22.6, 4000, false);
		car1.printCarDetails();
		Car car2 = new Car();
		car2.setCarDetails("i10", 20.6, 30000, false);
		car2.printCarDetails();
		Car car3 = new Car();
		car3.setCarDetails("i8", 12.6, 40000, true);
		car3.printCarDetails();
		Car car4 = new Car();
		car4.setCarDetails("scorpio", 16.6, 14400, false);
		car4.printCarDetails();
		Car car5 = new Car();
		car5.setCarDetails("xuv500", 18.6, 15000, false);
		car5.printCarDetails();
		
		Car cars[] = {car1,car2,car3,car4,car5};
		
		double maxprice=0.0d;
		String carname=null;
		
		for (Car car : cars) {
			if(car.price>maxprice) {
				maxprice=car.price;
				carname=car.carName;
			}
		}
		
		System.out.println("Max price car name is: "+carname);
		
	}
	
	
}
