package br.com.animalShelter.animal;

public class Animal {

	private String code;
	private String nome;
	private double weight;
	private Integer age;
	private String size;
	private String type;
	private String species;
	private boolean adopted;
	
	
	public Animal(String code, String nome, double weight, Integer age, String size, String type, String species,
			boolean adopted) {
		super();
		this.code = code;
		this.nome = nome;
		this.weight = weight;
		this.age = age;
		this.size = size;
		this.type = type;
		this.species = species;
		this.adopted = adopted;
	}


	public String getCode() {
		return code;
	}


	public String getNome() {
		return nome;
	}


	public double getWeight() {
		return weight;
	}


	public Integer getAge() {
		return age;
	}


	public String getSize() {
		return size;
	}


	public String getType() {
		return type;
	}


	public String getSpecies() {
		return species;
	}


	public boolean isAdopted() {
		return adopted;
	}
	
}
