package com.castillo.services.dogrescue.entities;

import java.io.Serializable;
import java.util.Date;

public class Report implements Serializable {

	private static final long serialVersionUID = -5183265500284826010L;
	
	private Long id;
	private Dog dog;
	private Address address;
	private Date date;
	private Double reward;
	private ReportType type;
	private ReportStatus status;
	
	@Deprecated
	public Report() {
		super();
	}

	public Report(Long id, Dog dog, Address address, Date date, Double reward, ReportType type, ReportStatus status) {
		super();
		this.id = id;
		this.dog = dog;
		this.address = address;
		this.date = date;
		this.reward = reward;
		this.type = type;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getReward() {
		return reward;
	}

	public void setReward(Double reward) {
		this.reward = reward;
	}

	public ReportType getType() {
		return type;
	}

	public void setType(ReportType type) {
		this.type = type;
	}

	public ReportStatus getStatus() {
		return status;
	}

	public void setStatus(ReportStatus status) {
		this.status = status;
	}
	
}
