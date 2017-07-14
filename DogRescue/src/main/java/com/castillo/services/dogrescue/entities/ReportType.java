package com.castillo.services.dogrescue.entities;

import java.io.Serializable;

public class ReportType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 269736351271766987L;
	
	private int id;
	private String code;
	private String Description;
	
	public ReportType() {
		super();
	}
	
	public ReportType(int id, String code, String description) {
		super();
		this.id = id;
		this.code = code;
		Description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
