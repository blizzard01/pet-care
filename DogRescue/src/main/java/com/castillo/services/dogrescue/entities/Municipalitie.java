package com.castillo.services.dogrescue.entities;

import java.io.Serializable;

public class Municipalitie implements Serializable {

	private static final long serialVersionUID = 897825388500388441L;
	
	private int id;
	private String name;
	
	@Deprecated
	public Municipalitie() {
		super();
	}
	
	public Municipalitie(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
