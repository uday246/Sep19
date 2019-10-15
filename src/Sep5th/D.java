package Sep5th;

class A {
	public void ma1() {
		System.out.println(" CA ");
	}
}

class B extends A {
	public void ma1() {
		System.out.println("B from A");
	}

	 public void ma2() {
		System.out.println("B only static");
	}
	 public void ma3() {
			System.out.println("B or C");
		}
		 
}

class C extends B {
	public void ma1() {
		System.out.println("C from B");
	}

	public void mc1() {
		System.out.println("C Only");
	}
	 public void ma2() {
		System.out.println("C only static");
	}
}

public class D {
	public static void main(String[] args) {
		// A type reference points to A type Object
		// here it is Static polymorphism
		// calling object will be dicided at compile time only
		A a = new A();
		// B type reference points to B type Object
		B b = new C();
		// C type reference points to C type Object
		C c = new C();
		// calling a class method
		// calling B class method
		c.ma1();
		b.ma1();
		b.ma3();
		// calling C class method
		c.mc1();
		// A type reference pointing to B type object
		b = new B();
		b.ma2();
		c.ma2();
		b.ma2();
	}
}
