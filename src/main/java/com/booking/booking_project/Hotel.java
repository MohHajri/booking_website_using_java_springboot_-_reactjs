package com.booking.booking_project;

// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import jakarta.persistence.FetchType;
// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Column;
import jakarta.persistence.*;

import java.util.List;
import lombok.Data;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "hotel")
@Data
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false, name = "phone_number")
    private String phoneNumber;

    @Column(nullable = false, name = "photo_url")
    private String photoUrl;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
    private List<Room> rooms;

    @OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
    private List<Availability> availabilities;

}
