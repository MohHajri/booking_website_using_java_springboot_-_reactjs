/*
 * HotelController class and a method for the GET /hotels endpoint in your
 * Spring Boot application
 */

package com.booking.booking_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private AvailabilityRepository availabilityRepository;

    @GetMapping("/hotels")
    public Iterable<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @GetMapping("/hotels/{hotel_id}/rooms")
    public List<Room> getRoomsByHotelId(@PathVariable("hotel_id") Long hotel_id) {
        return roomRepository.findByHotelId(hotel_id);
    }

    @GetMapping("/hotels/{hotel_id}/availability")
    public List<Availability> getHotelAvailability(@PathVariable Long hotel_id) {
        List<Availability> availabilityList = availabilityRepository.findByHotelId(hotel_id);
        return availabilityList;
    }

    @PostMapping("/hotels")
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelRepository.save(hotel);
    }

}
