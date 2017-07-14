package com.castillo.services.dogrescue.entities;

import java.io.Serializable;

public class Breed implements Serializable {

	private static final long serialVersionUID = -4896879118305792067L;
	
	private Long id;
	private String name;
	private String picture;
	
	@Deprecated
	public Breed() {
		super();
	}
	public Breed(Long id, String name, String picture) {
		super();
		this.id = id;
		this.name = name;
		this.picture = picture;
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
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
}
