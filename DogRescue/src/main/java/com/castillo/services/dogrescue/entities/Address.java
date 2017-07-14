package com.castillo.services.dogrescue.entities;

import java.io.Serializable;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2977907869940083528L;
	
	private Long id;
	private String Street;
	private Municipalitie municipalitie;
	private String neighborhood;
	
	@Deprecated
	public Address() {
		super();
	}
	
	public Address(Long id, String street, Municipalitie municipalitie, String neighborhood) {
		super();
		this.id = id;
		Street = street;
		this.municipalitie = municipalitie;
		this.neighborhood = neighborhood;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public Municipalitie getMunicipalitie() {
		return municipalitie;
	}

	public void setMunicipalitie(Municipalitie municipalitie) {
		this.municipalitie = municipalitie;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	
}
