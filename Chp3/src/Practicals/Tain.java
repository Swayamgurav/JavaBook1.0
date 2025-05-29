package Practicals;

class Emp{
	String name;
	int id;
	double sal;
	float contactno;
	
	public Emp(String name, int id, double sal, float contactno) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Emp[name=" + name + ", id=" + id + ", sal=" + sal + ", contactno=" + contactno + "]";
	}
	
	
}
public class Tain {
	public static void main(String[] args) {
		Emp  main =  new  Emp("Swayam", 1, 23456, 134265);
		Emp  main1 =  new  Emp("Lagan", 2, 20987, 987653);
		Emp  main2 =  new  Emp("Ankush",3, 34587,  3545627);
		Emp  main3 =  new  Emp("Sohan", 4, 14532, 465237);
		System.out.println(main);
		System.out.println(main1);
		System.out.println(main2);
		System.out.println(main3);
		
	}

}
