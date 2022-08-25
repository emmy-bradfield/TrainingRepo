package com.emily.main.controller;

import java.util.List;

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
import com.emily.main.domain.GuestDTO;
import com.emily.main.service.GuestService;

@RestController
@RequestMapping("/guest")
public class GuestController {
	
	private GuestService service;
	private UserController controller;
	
	public GuestController(GuestService service, UserController controller) {
		super();
		this.service=service;
		this.controller = controller;
	}
	
	@PostMapping("/create")
	public ResponseEntity<GuestDTO> inviteGuest(@RequestBody Guest guest) {
		this.controller.createAccount(guest);
		return new ResponseEntity<GuestDTO>(this.service.inviteGuest(guest), HttpStatus.CREATED);
	}
	
	@GetMapping("/readAll")
	public List<GuestDTO> viewGuestList(){
		return this.service.viewGuestList();
	}
	
	@GetMapping("/read")
	public GuestDTO viewGuest(@PathParam("id") Long id) {
		return this.service.viewGuest(id);
	}
	
	@PutMapping("/update")
	public GuestDTO amendGuest(@PathParam("id") Long id, @RequestBody Guest guest) {
		return this.service.amendGuest(id, guest);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Boolean> removeGuest(@PathParam("id") Long id) {
		this.controller.delete(id);
		return new ResponseEntity<Boolean>(this.service.removeGuest(id), HttpStatus.NO_CONTENT);
	}

}
