package Q1;

class Emp {
	int id = 1;
	String name = "swayam";
	double  salary= 123456;
	String address = "kandivali";
	  void displayinfo() {
		System.out.println(id+" "+name+" "+salary+" "+address);
	}
	public Emp(int id, String name, double salary, String address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
			 
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(1, "Swayam", 123456, "kandivali");
		System.out.println(emp);
		
	}

}
