package br.com.animalShelter.adoption;

import java.time.LocalDate;

import br.com.animalShelter.adopter.Adopter;
import br.com.animalShelter.animal.Animal;

public class Adoption {
	
	private Adopter adopter;
	private Animal animal;
	private Integer voluntaryRegistration;
	private LocalDate date;
	
	public Adoption(Adopter adopter, Animal animal, Integer voluntaryRegistration, LocalDate date) {
		super();
		this.adopter = adopter;
		this.animal = animal;
		this.voluntaryRegistration = voluntaryRegistration;
		this.date = date;
	}

	public Adopter getAdopter() {
		return adopter;
	}

	public Animal getAnimal() {
		return animal;
	}

	public Integer getVoluntaryRegistration() {
		return voluntaryRegistration;
	}

	public LocalDate getDate() {
		return date;
	}
	
	
	

}
