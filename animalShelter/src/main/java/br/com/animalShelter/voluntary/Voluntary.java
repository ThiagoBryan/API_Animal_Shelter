package br.com.animalShelter.voluntary;

import br.com.animalShelter.personalData.PersonalData;

public class Voluntary {
	
	private PersonalData personalData;
	private Integer registration;
	
	public Voluntary(PersonalData personalData, Integer registration) {
		super();
		this.personalData = personalData;
		this.registration = registration;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public Integer getRegistration() {
		return registration;
	}
	
	

}
