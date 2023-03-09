package com.booking.booking_project;

import jakarta.persistence.*;

import lombok.Data;
import java.time.LocalDate;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "availability")
@Data
public class Availability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, name = "start_date")
    private LocalDate startDate;

    @Column(nullable = false, name = "end_date")
    private LocalDate endDate;

    @Column(nullable = false, name = "nums_available_rooms")
    private int numsAvailableRooms;

    @Column(nullable = false, name = "price_per_night")
    private double pricePerNight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;
    // getters and setters

}
