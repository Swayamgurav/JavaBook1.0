package Q1;

class A {
	final int a = 10;

	final void math() {
		System.out.println(a);
	}
}

final class B  extends A{

//}//Cannot override the math method because it is marked as Final 
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
	}
}
