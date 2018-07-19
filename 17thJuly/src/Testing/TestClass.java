package Testing;

public class TestClass {

	public static void main(String[] args) {
		Trainer t = new Trainer();
		MySchool ms = new MySchool();
		LabTrainer lt=new LabTrainer();
		 
		t.name="fsg";
		//t.age=10;
		//t.salary=12000d;
		
		ms.city="Udupi";
		ms.noOfStudents=20;
		ms.schoolName="LRIS";
		
		lt.name="Jason";
		lt.salary=20500; //protected
		
	}

}
