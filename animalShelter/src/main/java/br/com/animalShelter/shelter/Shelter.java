package br.com.animalShelter.shelter;

import java.util.ArrayList;
import java.util.List;

import br.com.animalShelter.address.Address;
import br.com.animalShelter.animal.Animal;
import br.com.animalShelter.voluntary.Voluntary;

public class Shelter {
	
	private List<Voluntary> volunteers = new ArrayList<>();
	private List<Animal> animals = new ArrayList<>();;
	private Address address;
	private String cnpj;
	
	public Shelter(List<Voluntary> volunteers, List<Animal> animals, Address address, String cnpj) {
		super();
		this.volunteers = volunteers;
		this.animals = animals;
		this.address = address;
		this.cnpj = cnpj;
	}

	public List<Voluntary> getVolunteers() {
		return volunteers;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public Address getAddress() {
		return address;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	
	
	

}
