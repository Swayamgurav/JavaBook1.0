package Q2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ArrayList.Emp;
import ArrayList.Operations;

public class OperationsImp implements Operations{

HashMap<Integer, String> db=new HashMap<Integer, String>();
	
	
	public void insertData(Map<Integer, String> students) {
		// TODO Auto-generated method stub
		db.putAll(students);
		System.out.println("Inserted successfully");
		
		
	}

	
	public void updateData(int id, String name) {
		// TODO Auto-generated method stub
		Set<Entry<Integer, String>> set=db.entrySet();
		Iterator iterator=set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry=(Entry<Integer, String>) iterator.next();
			if(entry.getKey()==id) {
				entry.setValue(name);
				System.out.println("Data updated.....");
			}
			
		}
		
		
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		Set<Entry<Integer, String>> set=db.entrySet();
		Iterator iterator=set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry=(Entry<Integer, String>) iterator.next();
			if(entry.getKey()==id) {
				iterator.remove();
				System.out.println("Data deleted.....");
			}
			
		}
		
		
	}

	@Override
	public void searchData(int id) {
		// TODO Auto-generated method stub
		Set<Entry<Integer, String>> set=db.entrySet();
		Iterator iterator=set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry=(Entry<Integer, String>) iterator.next();
			if(entry.getKey()==id) {
				System.out.println(entry);
			}
			
		}
		
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		Set<Entry<Integer, String>> set=db.entrySet();
		Iterator iterator=set.iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry=(Entry<Integer, String>) iterator.next();
			System.out.println(entry);
			
		}
		
	}

	@Override
	public void insertData(List<Emp> emp) {
		// TODO Auto-generated method stub
		
	}


}
