package com.booking.booking_project;

import jakarta.persistence.*;

import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "booking")
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long id;

    @Column(nullable = false, name = "checkin_date")
    private LocalDate checkinDate;

    @Column(nullable = false, name = "checkout_date")
    private LocalDate checkoutDate;

    @Column(nullable = false, name = "guest_name")
    private String guestName;

    @Column(nullable = false, name = "guest_email")
    private String guestEmail;

    @Column(nullable = false, name = "total_price")
    private double totalPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    // getters and setters

}
