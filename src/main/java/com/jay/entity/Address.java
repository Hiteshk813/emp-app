package com.jay.entity;

public class Address {
private int id;
private String street1;
private String street2;
private String city;
private String state;
private String district;
private String pin;
public Address() {
	super();
}
public Address(int id, String street1, String street2, String city, String state, String district, String pin) {
	super();
	this.id = id;
	this.street1 = street1;
	this.street2 = street2;
	this.city = city;
	this.state = state;
	this.district = district;
	this.pin = pin;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStreet1() {
	return street1;
}
public void setStreet1(String street1) {
	this.street1 = street1;
}
public String getStreet2() {
	return street2;
}
public void setStreet2(String street2) {
	this.street2 = street2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((district == null) ? 0 : district.hashCode());
	result = prime * result + id;
	result = prime * result + ((pin == null) ? 0 : pin.hashCode());
	result = prime * result + ((state == null) ? 0 : state.hashCode());
	result = prime * result + ((street1 == null) ? 0 : street1.hashCode());
	result = prime * result + ((street2 == null) ? 0 : street2.hashCode());
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
	Address other = (Address) obj;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (district == null) {
		if (other.district != null)
			return false;
	} else if (!district.equals(other.district))
		return false;
	if (id != other.id)
		return false;
	if (pin == null) {
		if (other.pin != null)
			return false;
	} else if (!pin.equals(other.pin))
		return false;
	if (state == null) {
		if (other.state != null)
			return false;
	} else if (!state.equals(other.state))
		return false;
	if (street1 == null) {
		if (other.street1 != null)
			return false;
	} else if (!street1.equals(other.street1))
		return false;
	if (street2 == null) {
		if (other.street2 != null)
			return false;
	} else if (!street2.equals(other.street2))
		return false;
	return true;
}
@Override
public String toString() {
	return "Address [id=" + id + ", street1=" + street1 + ", street2=" + street2 + ", city=" + city + ", state=" + state
			+ ", district=" + district + ", pin=" + pin + "]";
}


}
