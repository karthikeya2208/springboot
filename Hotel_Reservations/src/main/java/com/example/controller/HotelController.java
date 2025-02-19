package com.example.controller;

import com.example.entity.Hotel;
import com.example.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels") // Base path for all hotel-related endpoints
public class HotelController {
    @Autowired
    private HotelService hotelService;

    // GET API: Retrieve all hotels
    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels(); // Corrected this line
    }

    // POST API: Add a new hotel
    @PostMapping
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelService.addHotel(hotel);
    }
}
