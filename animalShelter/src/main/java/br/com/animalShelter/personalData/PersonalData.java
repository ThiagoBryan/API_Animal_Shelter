package br.com.animalShelter.personalData;

public class PersonalData {
	
	private String name;
	private String phone;
	private String cpf;
	private Integer registration;
	
	public PersonalData(String name, String phone, String cpf, Integer registration) {
		super();
		this.name = name;
		this.phone = phone;
		this.cpf = cpf;
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getCpf() {
		return cpf;
	}

	public Integer getRegistration() {
		return registration;
	}

}
