package com.jay.entity;

public class Employee {
private int id;
private String name;
private String dept;
private int sal;
private boolean isMarried;
private String emailId;
private String phoneNo;
private Address address;
public Employee() {
	super();
}

public Employee(int id, String name, String dept, int sal, boolean isMarried, String emailId, String phoneNo,
		Address address) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.sal = sal;
	this.isMarried = isMarried;
	this.emailId = emailId;
	this.phoneNo = phoneNo;
	this.address = address;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public int getSal() {
	return sal;
}

public void setSal(int sal) {
	this.sal = sal;
}

public boolean isMarried() {
	return isMarried;
}

public void setMarried(boolean isMarried) {
	this.isMarried = isMarried;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPhoneNo() {
	return phoneNo;
}

public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((dept == null) ? 0 : dept.hashCode());
	result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
	result = prime * result + id;
	result = prime * result + (isMarried ? 1231 : 1237);
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((phoneNo == null) ? 0 : phoneNo.hashCode());
	result = prime * result + sal;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (dept == null) {
		if (other.dept != null)
			return false;
	} else if (!dept.equals(other.dept))
		return false;
	if (emailId == null) {
		if (other.emailId != null)
			return false;
	} else if (!emailId.equals(other.emailId))
		return false;
	if (id != other.id)
		return false;
	if (isMarried != other.isMarried)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (phoneNo == null) {
		if (other.phoneNo != null)
			return false;
	} else if (!phoneNo.equals(other.phoneNo))
		return false;
	if (sal != other.sal)
		return false;
	return true;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + ", isMarried=" + isMarried
			+ ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", address=" + address + "]";
}


}
