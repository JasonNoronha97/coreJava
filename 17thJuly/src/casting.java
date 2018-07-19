class A {
	int a = 50;
}

class B extends A {
	int b = 25, a = 5;
}

class C extends B {
	int c = 75;
}

public class casting {
	public static void main(String[] args) {
		C c1 = new C();
		
		System.out.println("c1.a: "+c1.a + "   c1.b: "+c1.b+"   c1.c: "+c1.c);
		System.out.println(((A)c1).a);
	}
}
