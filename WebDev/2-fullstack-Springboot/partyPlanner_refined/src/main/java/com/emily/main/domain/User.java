package com.emily.main.domain;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private Boolean activated;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_guest", referencedColumnName = "id")
	private Guest fk_guest;

	public User() {
	};

	public User(String username) {
		super();
		this.setUsername(username);
	}

	public User(String username, String password, Boolean activated, Long fk_guest) {
		super();
		this.setUsername(username);
		this.setPassword(password);
		this.setActivated(activated);
	}

	public User(Long id, String username, String password, Boolean activated, Long fk_guest) {
		super();
		this.setId(id);
		this.setUsername(username);
		this.setPassword(password);
		this.setActivated(activated);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getActivated() {
		return activated;
	}

	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	public Guest getFk_guest() {
		return fk_guest;
	}

	public void setFk_guest(Guest fk_guest) {
		this.fk_guest = fk_guest;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username, password, activated);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(activated, other.activated) && Objects.equals(id, other.id)
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}

}
