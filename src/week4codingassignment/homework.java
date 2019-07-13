package week4codingassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> employeeNames = new ArrayList<String>();
		
		employeeNames.add("Bob Gibbons");
		employeeNames.add("Bill Pierce");
		employeeNames.add("Sammie Jones");
		employeeNames.add("Frank Castle"); 
		employeeNames.add("Tom Jones");
		
		Set<Integer> ids = new HashSet<Integer>();
		
		ids.add(1654);
		ids.add(1567);
		ids.add(1201);
		ids.add(1333);
		ids.add(1447);
		
		Map<Integer, String> employeeMap = new HashMap <Integer, String>();
		
		
		int i = 0;
		for (int employeeList : ids) {
			employeeMap.put(employeeList, employeeNames.get(i++)); 
		}

		for (int employee : employeeMap.keySet()) {
			System.out.println(employee + " - " + employeeMap.get(employee));
		}

		StringBuilder idsBuilder = new StringBuilder();
		for (int id : ids) {
			idsBuilder.append(id + " - ");
		}
		System.out.println(idsBuilder.toString());
		
		// I added a comma as well, its easier for me to read on the sysout
		StringBuilder namesBuilder = new StringBuilder();
		for(String name : employeeNames) {
			namesBuilder.append(name + ", ");
		}
		System.out.println(namesBuilder.toString());

		
  }

}
