package mum.edu.cs.cs425.flightManagemenetApp.serviceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.cs.cs425.flightManagemenetApp.model.Airport;
import mum.edu.cs.cs425.flightManagemenetApp.repository.AirportRepository;
import mum.edu.cs.cs425.flightManagemenetApp.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService{

	
	@Autowired
	private AirportRepository airportRepo;
	
	@Override
	public Airport save(Airport airport) {
		// TODO Auto-generated method stub
		return airportRepo.save(airport);
	}

	@Override
	public void delete(Airport airport) {
		// TODO Auto-generated method stub
		airportRepo.delete(airport);;
	}

	@Override
	public List<Airport> findAll() {
		// TODO Auto-generated method stub
		return airportRepo.findAll();
	}

	@Override
	public Airport getAirport(Integer id) {
		// TODO Auto-generated method stub
		return airportRepo.findById(id).get();
	}

//	@Override
//	public Airport getAirport(Integer airport_id) {
//		// TODO Auto-generated method stub
//		return airportRepo.findById(airport_id).get();
//	}

	
	
	

	


	

	

//	@Override
//	public List<Airport> findAll() {
//		// TODO Auto-generated method stub
//		return airportRepo.findAll();
//	}
//
//
//	@Override
//	public Airport getAirport(String code) {
//		// TODO Auto-generated method stub
//		return airportRepo.findById(code);
//	}

}
