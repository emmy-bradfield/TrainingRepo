package com.emily.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.emily.main.domain.Guest;

@Repository
public interface GuestRepo extends JpaRepository<Guest, Long>{
	
	@Query("SELECT g FROM Guest g WHERE g.fname = ?1")
	List<Guest> findGuestByNameJPQL(String name);
	
	@Query(value = "SELECT g FROM Guest g WHERE g.attending = ?1")
	List<Guest> findGuestByAttendingJPQL(Boolean attending);
	
	@Query(value = "SELECT g FROM Guest g WHERE g.staying = ?1")
	List<Guest> findGuestsStaying(Boolean staying);
	
	@Query(value = "SELECT g FROM Guest g WHERE g.parking = ?1")
	List<Guest> findGuestsParkinh(Boolean parking);

}
