package com.bookstore.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity
@IdClass(Address.AddressKey.class)
public class Address {

	@Id
	private String street;
	@Id
	private String city;
	private String stateProvince;
	private String postalCode;
	private String country;

	public Address() {
	}

	public Address(String street, String city, String stateProvince, String postalCode, String country) {
		this.street = street;
		this.stateProvince = stateProvince;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	class AddressKey implements Serializable {
		private String street;
		private String city;
	}
}
