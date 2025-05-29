package Q2;

class Dob {
	int id;
	String name;
	static String dept_name = "Developer";
	static String comp_name = "Google";
	
	public Dob (int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	  void displayInfo() {
		  System.out.println(id+" "+name);
	  }
	  static void displayCompInfo() {
		  System.out.println(dept_name+" "+comp_name);
	  }
}

	  public class Den {
	  public static void main(String[] args) {
		  Dob.displayCompInfo();
		  Dob emp = new Dob(1, "Swayam");
		  emp.displayInfo();
	}
 }


