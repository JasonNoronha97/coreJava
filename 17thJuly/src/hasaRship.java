//Jason Noronha 19-07-18

	class Employee1 {
		double salary;
		String name;
		int eid;
		String dept;
		Address add;

		public Employee1(double salary, String name, int eid, String dept, Address add) {
			this.salary = salary;
			this.name = name;
			this.eid = eid;
			this.dept = dept;
			this.add = add;
		}

		public void printEmpDetails() {
			System.out.println(
					"Employee1 [salary=" + salary + ", \nname=" + name + ", \neid=" + eid + ", \ndept=" + dept + "]");
			add.printAddressDetails();
		}

	}

	class Address {
		int flatNo;
		String aptName, main, cross, city;
		long pincode;

		/**
		 * @param flatNo
		 * @param aptName
		 * @param main
		 * @param cross
		 * @param city
		 * @param pincode
		 */

		public Address(int flatNo, String aptName, String main, String cross, String city, long pincode) {
			this.flatNo = flatNo;
			this.aptName = aptName;
			this.main = main;
			this.cross = cross;
			this.city = city;
			this.pincode = pincode;
		}

		public void printAddressDetails() {
			System.out.println("Address [flatNo=" + flatNo + ", aptName=" + aptName + ", main=" + main + ", cross="
					+ cross + ", city=" + city + ", pincode=" + pincode + "]");
		}

	}

public class hasaRship {

	public static void main(String[] args) {
		Address a = new Address(102, "Shalom", "7th Main", "8th Cross", "Bengaluru", 570036);
		
		Employee1 e1 = new Employee1(15333.2, "Jayesh", 123, "IT", a);
		e1.printEmpDetails();
		
	}
}
