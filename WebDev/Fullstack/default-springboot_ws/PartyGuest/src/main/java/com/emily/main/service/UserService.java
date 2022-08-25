package com.emily.main.service;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.emily.main.domain.Guest;
import com.emily.main.domain.User;
import com.emily.main.repository.UserRepo;

@Service
public class UserService {
	private UserRepo repo;
	
	public UserService(UserRepo repo) {
		super();
		this.repo=repo;
	}
	
	public User createAccount(Guest guest) {
		User user = new User();
		Long id = guest.getId();
		user.setId(id);
		user.setUsername(guest.getFname().toLowerCase() + "-" + guest.getSname().toLowerCase());
		user.setPassword("!" + guest.getFname().substring(0,2).toLowerCase() + ThreadLocalRandom.current().nextInt(100, 999 + 1) + guest.getSname().substring(0,2).toLowerCase());
		user.setActivated(false);
		user.setFk_guest(guest);
		return this.repo.saveAndFlush(user);
	}
	
	public String recoverUser(Long id) {
		Optional<User> userOp = this.repo.findById(id);
		User user = userOp.get();
		String recovered = user.getUsername();
		return recovered;
	}
	
	public Boolean changePassword(Long id, String password) {
		Optional<User> userOp = this.repo.findById(id);
		User user = userOp.get();
		user.setId(id);
		user.setPassword(password);
		this.repo.saveAndFlush(user);
		Boolean updated = true;
		return updated;
	}
	
	public Boolean activate(Long id) {
		Optional<User> userOp = this.repo.findById(id);
		User user = userOp.get();
		user.setId(id);
		user.setActivated(true);
		this.repo.saveAndFlush(user);
		return user.getActivated();
	}
	
	public void delete(Long id) {
		this.repo.deleteById(id);
	}
}
