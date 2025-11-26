package com.carryconnect.api.dao;

import com.carryconnect.api.entity.PostStatus;
import com.carryconnect.api.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip,Long> {

    List<Trip> findByOriginCityAndDestinationCity(String originCity, String destinationCity);

    List<Trip> findByFlightDate(LocalDate flightDate);

    List<Trip> findByPostStatus(PostStatus status);

    List<Trip> findByUserUserId(Long userId);

    List<Trip> findByExpiryDateBefore(LocalDate today);

}
