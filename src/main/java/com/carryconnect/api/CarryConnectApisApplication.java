package com.carryconnect.api;

import com.carryconnect.api.entity.Trip;
import com.carryconnect.api.service.TripService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CarryConnectApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarryConnectApisApplication.class, args);
	}

    @Bean
    public CommandLineRunner runner(TripService ts){

        return args -> {

            System.out.println("--------------------------------------------");
            List<Trip> result = ts.searchTrips("Addis Ababa","Washington DC");

            for(Trip t : result){

                System.out.println("Origin : " + t.toString());
            }

           // long c=result.stream().peek(t->{ System.out.println( t.toString());}).count();


        };
    }
}
