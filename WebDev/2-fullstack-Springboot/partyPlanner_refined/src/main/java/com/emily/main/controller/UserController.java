package com.emily.main.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emily.main.domain.Guest;
import com.emily.main.domain.User;
import com.emily.main.service.UserService;

@RestController
@RequestMapping("/account")
public class UserController {
	
	private UserService service;
	
	public UserController(UserService service) {
		super();
		this.service=service;
	}
	
	@PostMapping("/create")
	public ResponseEntity<User> createAccount(@RequestBody Guest guest){
		return new ResponseEntity<User>(this.service.createAccount(guest), HttpStatus.CREATED);
	}
	
	@GetMapping("/getUsername")
	public String getUsername(@PathParam("id") Long id) {
		return this.service.recoverUser(id);
	}
	
	@PutMapping("/changePassword")
	public ResponseEntity<Boolean> changePassword(@PathParam("id") Long id, @RequestBody String password){
		return new ResponseEntity<Boolean>(this.service.changePassword(id, password), HttpStatus.OK);
	}
	
	@PutMapping("/activate")
	public Boolean acitvate(@PathParam("id") Long id) {
		return this.service.activate(id);
	}
	
	@DeleteMapping("/delete")
	public void delete(@PathParam("id") Long id) {
		this.service.delete(id);
	}

}
