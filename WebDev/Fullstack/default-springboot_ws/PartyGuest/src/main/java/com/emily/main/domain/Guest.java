package com.emily.main.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Guest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String fname;
	@Column(nullable=false)
	private String sname;
	@Column
	private Boolean attending;
	@Column
	private Long additional;
	@Column
	private Boolean staying;
	@Column
	private Boolean parking;
	
	
	public Guest() {};
	public Guest(String fname, String sname) {
		super();
		this.setFname(fname);
		this.setSname(sname);
	}
	
	public Guest(Long id, String fname, String sname, Boolean attending, Long additional, Boolean staying, Boolean parking) {
		super();
		this.setId(id);
		this.setFname(fname);
		this.setSname(sname);
		this.setAttending(attending);
		this.setAdditional(additional);
		this.setStaying(staying);
		this.setParking(parking);				
	}
	
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
	public Long getAdditional() {
		return additional;
	}
	public void setAdditional(Long additional) {
		this.additional = additional;
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
	@Override
	public int hashCode() {
		return Objects.hash(id, fname, sname, attending, additional, staying, parking);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guest other = (Guest) obj;
		return Objects.equals(additional, other.additional) && Objects.equals(attending, other.attending)
				&& Objects.equals(fname, other.fname) && Objects.equals(id, other.id)
				&& Objects.equals(parking, other.parking) && Objects.equals(sname, other.sname)
				&& Objects.equals(staying, other.staying);
	}
	

	

	
}
