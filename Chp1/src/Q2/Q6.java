package Q2;

class Address {
	String areaname;
	String city;

	public Address(String areaname, String city) {
		this.areaname = areaname;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [areaname=" + areaname + ", city=" + city + "]";
	}

}

class Hobbies {

}

class Vmp {
	String name;
	int id;
	Address address;
	Hobbies hobbies;

	public Vmp(String name, int id, Address address,Hobbies hobbies) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Vmp [name=" + name + ", id=" + id + ", address=" + address  + "]";
	}

}
public class Q6 {
	public static void main(String[] args) {
		Address address = new Address("Dahisar", " Mumbai");
		Vmp emp = new Vmp("Swayam", 112, address,null);
		System.out.println(emp);
	}
     
}
