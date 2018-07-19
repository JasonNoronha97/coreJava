class Employee {
}

class HR extends Employee {
}

class Technical extends Employee {
}

class Recruiter extends HR {
}

class Financier extends HR {
}

class JavaPM extends Technical {
}

class MainframePM extends Technical {
}

public class CastingAdv {

	public static void main(String[] args) {
		// Up casting
		Technical t1 = new JavaPM();
		HR h = new Recruiter();
		Employee e = new HR();
		Employee e1 = new MainframePM();
		// Down casting
		Technical t = new JavaPM();
		if (t instanceof JavaPM)
			;
		JavaPM jp = (JavaPM) t;
	}

}
