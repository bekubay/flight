package mum.edu.cs.cs425.flightManagemenetApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mum.edu.cs.cs425.flightManagemenetApp.model.Airport;

@Repository("AirportRepository")
public interface AirportRepository extends JpaRepository<Airport, Integer>{

}
