package com.booking.booking_project;

import jakarta.persistence.*;
import lombok.Data;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "room")
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long id;

    @Column(nullable = false, name = "room_number")
    private String roomNumber;

    @Column(nullable = false, name = "room_type")
    private String roomType;

    @Column(nullable = false, name = "room_description")
    private String roomDescription;

    @Column(nullable = false, name = "price_per_night")
    private int pricePerNight;

    @Column(nullable = false, name = "num_beds")
    private int numBeds;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    // Getters and Setters

}
