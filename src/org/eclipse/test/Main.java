package org.eclipse.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.swing.JSpinner.ListEditor;

public class Main {

	public static void main(String[] args) {
		Map<Integer, String> fcb = new HashMap<>();
		fcb.put(9, "Suarez");
		fcb.put(10, "Messi");
		fcb.put(20, "Umtiti");
		fcb.put(7, "Iniesta");
		fcb.put(9, "Rivaldo");
		
		for (var entry : fcb.entrySet()) {
			if (entry.getValue().equals("Messi")) {
				System.out.println(entry.getKey());
			}
		}
		
		for (var entry : fcb.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			System.out.println(fcb.get(9));
			System.out.println(fcb.get(-9));
			System.out.println(fcb.getOrDefault(-9, "DOE"));
			System.out.println(fcb.containsKey(10));
			System.out.println(fcb.containsValue("Mitroglu"));
			System.out.println(fcb.entrySet());
		}
		
			System.out.println(fcb.keySet());
			System.out.println(fcb.values());
			System.out.println(fcb.entrySet());
		
		
//		HashSet set = new HashSet<>();
//		set.add(5);
//		set.add("bonjour");
//		set.add(3);
//		set.add(5);
//		for (Object elt : set) {
//			System.out.println(elt);
//		}
//		for (int i = 0; i < set.size(); i++) {
//			System.out.println(set.toArray()[i]);
			
		// }
//		Example<Integer, String> example1 = new Example<>();
//		example1.setAttrX(10);
//		example1.setAttrY("bonjour");
//		example1.setAttrZ(1200);
//		System.out.println(example1.getAttrX().getClass().getSimpleName());
//		System.out.println(example1.getAttrY().getClass().getSimpleName());
//		System.out.println(example1.getAttrZ().getClass().getSimpleName());
		
	}

}
