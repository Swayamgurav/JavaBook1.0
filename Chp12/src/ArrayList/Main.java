package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Emp emp1 = new Emp(11, "Tony", 42000);
		Emp emp2 = new Emp(12, "Chris", 56000);
		Emp emp3 = new Emp(13, "Thor", 78000);
		Emp emp4 = new Emp(14, "Bruce", 90000);
	
	List<Emp> list = new  ArrayList<Emp>();
	  list.add(emp1);
	  list.add(emp2);
	  list.add(emp3);
	  list.add(emp4);
	     
	  OperationsImp imp = new OperationsImp();
	  
	  imp.insertData(list);
	  imp.showData();
	  System.out.println("-------------------------");
	  imp.updateData(15,"Clint");
	  imp.showData();
	  System.out.println("-------------------------");
	  imp.deleteData(13);
	  imp.showData();
	  System.out.println("-------------------------");
	  imp.searchData(12);
	  
	  
}
}