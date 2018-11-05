package samples;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Application {
	
	public static Object getFirst(Map map) {
		return map.keySet().toArray()[0];
	}
	
	public static Object getLast(Map map) {
		
		return map.keySet().toArray()[map.keySet().toArray().length-1];
	}
	
	public static Object getPrev(Map map, Object mark) {
		Object[] keys= map.keySet().toArray();
		
		for(int i=0;i<keys.length;i++) {
			if(keys[i]==mark) {
				if(i>0) {
					return (Object)keys[i-1];
				}	
			}
		}
		return null;
	}
	
	public static Object getNext(Map map, Object mark) {
		Object[] keys= map.keySet().toArray();
		
		for(int i=0;i<keys.length;i++) {
			if(keys[i]==mark) {
				if(i<keys.length-1) {
					return (Object)keys[i+1];
				}	
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Map<Integer, List<Student>> map = new TreeMap<>();
		
		List<Student> studentList1 = new ArrayList<>();
		List<Student> studentList2 = new ArrayList<>();
		
		Student s1 = new Student("A", 1);
		Student s2 = new Student("AB", 23);
		Student s3 = new Student("ABC", 35);
		Student s4 = new Student("ED", 56);
		Student s5 = new Student("EDS", 44);
		
		studentList1.add(s1);
		studentList1.add(s2);
		studentList1.add(s3);
		
		studentList2.add(s4);
		studentList2.add(s5);
		
		map.put(24, studentList1);
		map.put(41, studentList2);
		map.put(58, studentList2);
		map.put(85, studentList1);
		
		
		
		Object i = getLast(map);
		
		for(Student s : map.get(85)) {
			System.out.println(s.name);
		}
		
		
		System.out.println(getNext(map,58));
		
		
		
		Double a=9.0;
		int b =9;
		
		BigDecimal qq = BigDecimal.valueOf(9);
		
		BigDecimal g = (BigDecimal)b;
		
				
		System.out.println(s1.toString());
		
		
//		for(Map.Entry<Integer, List<Student>> m : map.entrySet() 
//		{
//			
//			System.out.println(m.getKey());
//		}
		
		
		
		

	}

}
