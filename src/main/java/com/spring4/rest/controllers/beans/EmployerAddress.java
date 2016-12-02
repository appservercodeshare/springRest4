package com.spring4.rest.controllers.beans;

import javax.persistence.Embeddable;

@Embeddable
public class EmployerAddress {

	private String street;
	private String city;
	private String state;
	private String country;
	private String pin;
	private String landMark;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	@Override
	public String toString() {
		return "EmployerAddress [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pin=" + pin + ", landMark=" + landMark + "]";
	}

}
