package com.castillo.services.dogrescue.entities;

import java.io.Serializable;

public class Color implements Serializable {

	private static final long serialVersionUID = 7761005996758650340L;

	private int id;
	private String name;

	@Deprecated
	public Color() {
		super();
	}

	public Color(int id, String name) {
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
