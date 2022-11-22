package com.hotelserv.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelserv.entities.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String> {

}
