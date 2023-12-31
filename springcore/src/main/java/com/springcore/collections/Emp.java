package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String empName;
	private List<String> phone;
	private Set<String> address;
	private Map<String, String> courses;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String empName, List<String> phone, Set<String> address, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", phone=" + phone + ", address=" + address + ", courses=" + courses + "]";
	}
}
