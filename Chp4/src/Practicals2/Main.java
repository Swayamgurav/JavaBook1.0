package Practicals2;

class Emp {
	String name;
	int id;


	public Emp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Deleted......");
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();				
		Emp emp2 = new Emp();
		emp=null;
		System.out.println(emp);
		System.out.println(emp2);
		System.gc();
		System.out.println(emp2);

	}
}