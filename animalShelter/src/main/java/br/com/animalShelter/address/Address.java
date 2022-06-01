package br.com.animalShelter.address;

public class Address {
	
	private String street;
	private String zipCode;
	private Integer number;
	private String district;
	private String city;
	private String state;
	
	public Address(String street, String zipCode, Integer number, String district, String city, String state) {
		super();
		this.street = street;
		this.zipCode = zipCode;
		this.number = number;
		this.district = district;
		this.city = city;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public Integer getNumber() {
		return number;
	}

	public String getDistrict() {
		return district;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}
	
	
	
	

}
