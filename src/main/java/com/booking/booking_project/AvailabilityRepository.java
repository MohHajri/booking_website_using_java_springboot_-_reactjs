package com.booking.booking_project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailabilityRepository extends JpaRepository<Availability, Long> {

    List<Availability> findByHotelId(Long hotel_id);

}