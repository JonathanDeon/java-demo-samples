package com.jonathan;

import java.util.Objects;

public class Employee {
	
	String name;
	int id;
	@Override
	public int hashCode() {
		return Objects.hash(name,id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		
		
		return (id==other.id) && name.equals(other.name);
	}
	
	

}
