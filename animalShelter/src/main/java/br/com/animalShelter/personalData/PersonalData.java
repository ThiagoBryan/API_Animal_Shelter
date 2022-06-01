package br.com.animalShelter.personalData;

public class PersonalData {
	
	private String name;
	private String phone;
	private String cpf;

	
	public PersonalData(String name, String phone, String cpf) {
		super();
		this.name = name;
		this.phone = phone;
		this.cpf = cpf;
	
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

	

}
