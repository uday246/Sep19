package Sep6th;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
public class Test {
public static void main(String[] args) {
	List l = new ArrayList();
	Iterator i1 =l.iterator();
	Iterator i2 =l.iterator();
	Iterator i3 =l.iterator();
	A b1= new B();
	A b2= new C();
	b1=(B)b2;

}
}
