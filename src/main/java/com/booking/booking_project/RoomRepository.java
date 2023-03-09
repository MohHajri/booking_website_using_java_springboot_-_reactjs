package com.booking.booking_project;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

    // Method to find a room by ID
    List<Room> findByHotelId(Long hotel_id);

}
