package com.emily.main.domain;

public class GuestDTO {
	
	private Long id;
	private String fname;
	private String sname;
	private Boolean attending;
	private Long bringing;
	private Boolean staying;
	private Boolean parking;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() { 
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSname() { 
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Boolean getAttending() {
		return attending;
	}
	public void setAttending(Boolean attending) {
		this.attending = attending;
	}
	public Long getBringing() {
		return bringing;
	}
	public void setBringing(Long bringing) {
		this.bringing = bringing;
	}
	public Boolean getStaying() {
		return staying;
	}
	public void setStaying(Boolean staying) {
		this.staying = staying;
	}
	public Boolean getParking() {
		return parking;
	}
	public void setParking(Boolean parking) {
		this.parking = parking;
	}

}
