package com.emily.main.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.emily.main.domain.Guest;
import com.emily.main.domain.GuestDTO;
import com.emily.main.repository.GuestRepo;

@Service
public class GuestService {
	
	private GuestRepo repo;
	private ModelMapper mapper;
	
	public GuestService(GuestRepo repo, ModelMapper mapper) {
		super();
		this.repo=repo;
		this.mapper=mapper;
	}
	
	private GuestDTO mapToDTO(Guest guest) {
		return this.mapper.map(guest, GuestDTO.class);
	}
	
	public GuestDTO inviteGuest(Guest guest) {
		guest.setAttending(false);
		guest.setAdditional(0L);
		guest.setStaying(false);
		guest.setParking(false);
		Guest raw = this.repo.saveAndFlush(guest);
		return this.mapToDTO(raw);
	}
	
	public List<GuestDTO> viewGuestList() {
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public GuestDTO viewGuest(Long id) {
		Optional<Guest> guestOp = this.repo.findById(id);
		Guest guest = guestOp.get();
		return this.mapToDTO(guest);
	}
	
	public GuestDTO amendGuest(Long id, Guest newGuest) {
		Optional<Guest> guestOp = this.repo.findById(id);
		Guest guest = guestOp.get();
		guest.setId(id);
		if (newGuest.getFname() != null) {
		guest.setFname(newGuest.getFname());
		} else {
			guest.setFname(guest.getFname());
		}
		if (newGuest.getSname() != null) {
		guest.setSname(newGuest.getSname());
		} else {
			guest.setSname(guest.getSname());
		}
		if (newGuest.getAttending() != null) {
		guest.setAttending(newGuest.getAttending());
		} else {
			guest.setAttending(guest.getAttending());
		}
		if (newGuest.getAdditional() != null) {
		guest.setAdditional(newGuest.getAdditional());
		} else {
			guest.setAdditional(guest.getAdditional());
		}
		if (newGuest.getStaying() != null) {
		guest.setStaying(newGuest.getStaying());
		} else {
			guest.setStaying(guest.getStaying());
		}
		if (newGuest.getParking() != null) {
		guest.setParking(newGuest.getParking());
		} else {
			guest.setParking(guest.getParking());
		}
		Guest raw = this.repo.saveAndFlush(guest);
		return this.mapToDTO(raw);
	}
	
	public Boolean removeGuest(Long id) {
		Boolean del;
		this.repo.deleteById(id);
		del = true;
		return del;
	}

}
