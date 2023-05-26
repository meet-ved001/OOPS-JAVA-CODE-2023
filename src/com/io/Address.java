package com.io;

import java.io.Serializable;

public class Address implements Serializable {
String country,state,city;

public void setCountry(String country) {
	this.country = country;
}

public void setState(String state) {
	this.state = state;
}

public void setCity(String city) {
	this.city = city;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuffer("Country: ").append(country).append(" ,State:").append(state).append(" ,city:").append(city).toString();
	}
}
