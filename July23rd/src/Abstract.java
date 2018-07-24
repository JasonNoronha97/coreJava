abstract class Person {
	String name, location;
	int age;

	public boolean doesHeBreathe() {
		System.out.println("Every person breathes.");
		return true;
	}

	public boolean doesheSleep() {
		System.out.println("Every person Sleeps.");
		return true;
	}

	public abstract boolean doesHeDriveCar();
}

abstract class Employee extends Person {
	public abstract boolean doesHeDriveCar();
}

class Driver extends Employee{
	public boolean doesHeDriveCar() {
		System.out.println("Every driver can drive,");
		return true;
	}
}

public class Abstract {
	public static void main(String[] args) {
		Driver d = new Driver();
		d.doesHeBreathe();
		d.doesheSleep();
		d.doesHeDriveCar();
	}
}
