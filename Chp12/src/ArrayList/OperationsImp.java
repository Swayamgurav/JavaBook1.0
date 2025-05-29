package ArrayList;

import java.util.ArrayList;





import java.util.Iterator;
import java.util.List;

public class OperationsImp implements Operations {
       List<Emp> emps = new ArrayList<Emp>();
	@Override
	public void insertData(List<Emp> emp) {
		emps.addAll(emp);
		System.out.println("Data inserted successfully");
		
		
	}

	@Override
	public void updateData(int id, String name) {
		Iterator<Emp> iterator = emps.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if (emp.getId()== id) {
				emp.setName(name);
				System.out.println("data updated successfully");
			}
			
		}
	}

	@Override
	public void deleteData(int id) {
		Iterator<Emp> iterator = emps.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if (emp.getId()== id) {
				iterator.remove();
				System.out.println("data deleted successfully");
			}
		}
	}

	@Override
	public void searchData(int id) {
		
		
	}

	@Override
	public void showData() {
		
		
	}

}
