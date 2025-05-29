package Practicals;

class Imp {
	private String name;
	private double salary;
	private int id;

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setId(int id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
}

public class Lain {
	public static void main(String[] args) {
		Imp emp = new Imp();
		emp.setName("Shravan");
		emp.setSalary(15000);
		emp.setId(111);
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getId());
	}
}
