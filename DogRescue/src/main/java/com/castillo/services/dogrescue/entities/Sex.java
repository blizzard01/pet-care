package com.castillo.services.dogrescue.entities;

public enum Sex {
	Male("M"), Female("F");
	
	private String value;

	private Sex(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}
	
}
