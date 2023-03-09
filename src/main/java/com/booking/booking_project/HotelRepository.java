/*
 * declare the methods to interact with the database such as finding all hotels, finding a hotel by ID, saving a hotel,
 *  deleting a hotel, etc
 */

package com.booking.booking_project;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

    // Method to find all hotels
    List<Hotel> findAll();

    // Method to find a hotel by ID
    Optional<Hotel> findById(Long id);

    // Method to save a hotel
    <S extends Hotel> S save(S hotel);

    // Method to delete a hotel
    void delete(Hotel hotel);
}
