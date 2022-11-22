package com.hotelserv.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelserv.entities.Hotel;
import com.hotelserv.repo.HotelRepo;
import com.hotelserv.services.HotelService;
import com.userserv.exceptions.ResourceNotFoundException;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepo hotelRepo;

	@Override
	public Hotel create(Hotel hotel) {
		String id = UUID.randomUUID().toString();
		hotel.setId(id);
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRepo.findAll();
	}

	@Override
	public Hotel get(String id) throws ResourceNotFoundException {
		return hotelRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with id "+id+" not found"));
	}

}
