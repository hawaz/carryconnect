package com.carryconnect.api.service;


import com.carryconnect.api.dao.TripRepository;
import com.carryconnect.api.entity.Trip;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class TripService {

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }


    public List<Trip> searchTrips(String from, String to) {
        return tripRepository.findByOriginCityAndDestinationCity(from, to);
    }

}
