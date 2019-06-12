package mum.edu.cs.cs425.flightManagemenetApp.service;

import java.util.List;

import mum.edu.cs.cs425.flightManagemenetApp.model.Airport;

public interface AirportService {
	Airport save(Airport airport);
	void delete(Airport airport);
	List<Airport> findAll();
	Airport getAirport(Integer id);
	
}
