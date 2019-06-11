package com.pawan07.FinalSpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	int eid;
	String ename;
	Address eadd;

	public Employee() {

		System.out.println("Created Employee object");
	}

	// CONSTRUCTOR INJECTION
	public Employee(Address eadd) {
		this.eadd = eadd;
	}

	public Employee(int eid, String ename, Address eadd) {
		this.eid = eid;
		this.ename = ename;
		this.eadd = eadd;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getEadd() {
		return eadd;
	}

	// SETTER INJECTION
	public void setEadd(Address eadd) {
		this.eadd = eadd;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eadd=" + eadd + "]";
	}

}
