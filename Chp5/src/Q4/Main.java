package Q4;

class Vmp {

	void display(int a) {
		System.out.println(a);
	}

	void display(String a) {
		System.out.println(a);
	}

	void display(int a, int b) {
		System.out.println("Sum:" + (a + b));
	}

	void display(String a, String b) {
		System.out.println("Name :" + (a + b));
	}
}

class Emp2 extends Vmp {
	@Override
	void display(int a, int b) {
		System.out.println("Subtraction:" + (a - b));

	}
}

public class Main {
	public static void main(String[] args) {
		Vmp emp = new Vmp();
		Emp2 emp2 = new Emp2();
		emp.display(10);
		emp.display("Simmba");
		emp.display(10, 20);
		emp.display("Simmba", " Sharma");
		emp2.display(20);
		emp2.display(20, 10);
	}
}
