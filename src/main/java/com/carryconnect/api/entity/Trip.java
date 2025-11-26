package com.carryconnect.api.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name ="trips" )
public class Trip {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="trip_id")
    private int tripId;

    @ManyToOne
    @JoinColumn( name="user_id")
   private User user;

    @Column(name="origin_city")
    private String originCity;

    @Column(name="destination_city")
    private String destinationCity;

    @Column(name="flight_date")
    private LocalDate flightDate;

    @Column(name="available_kgs")
    private Double availableKgs;

    @Column(name="price_type")
    private String priceType;

    @Column(name="expected_price")
    private Double expectedPrice;

    @Column(name="contact_info")
    private String contactInfo;

    @Column(name="description",columnDefinition = "TEXT")
    private String description;

    @Column(name="paid_listing")
    private boolean paid_listing;

    @Column(name="boosted")
    private boolean  boosted;

    @Column(name="post_status")
    @Enumerated(EnumType.STRING)
    private PostStatus postStatus;

    @Column(name="expiry_date")
    private LocalDate expiryDate;

    @Column(name="created_at")
    private LocalDateTime  createdAt;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;


}
