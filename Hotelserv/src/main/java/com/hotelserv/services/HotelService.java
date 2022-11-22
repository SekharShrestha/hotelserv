package com.hotelserv.services;

import java.util.List;

import com.hotelserv.entities.Hotel;
import com.userserv.exceptions.ResourceNotFoundException;

public interface HotelService {

	public Hotel create(Hotel hotel);
	public List<Hotel> getAll();
	public Hotel get(String id) throws ResourceNotFoundException;
}
