package com.castillo.services.dogrescue.entities;

import java.io.Serializable;

public class Province implements Serializable {

	private static final long serialVersionUID = 5275620553748042010L;
	
	private Long id;
	private String name;
	private Municipalitie municipalitie;
	
	@Deprecated
	public Province() {
		super();
	}

	public Province(Long id, String name, Municipalitie municipalitie) {
		super();
		this.id = id;
		this.name = name;
		this.municipalitie = municipalitie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Municipalitie getMunicipalitie() {
		return municipalitie;
	}

	public void setMunicipalitie(Municipalitie municipalitie) {
		this.municipalitie = municipalitie;
	}
		
}
