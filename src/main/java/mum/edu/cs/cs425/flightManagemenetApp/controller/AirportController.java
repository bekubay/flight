package mum.edu.cs.cs425.flightManagemenetApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mum.edu.cs.cs425.flightManagemenetApp.model.Airport;
import mum.edu.cs.cs425.flightManagemenetApp.service.AirportService;

@Controller
@RequestMapping(value = "/airport")
public class AirportController {
	
	@Autowired 
	private AirportService airportService;

	//displaying home page
	@GetMapping(value ="/home")
	public String home() {
		return "/airport/index";
	}
	
	//adding an airport
	@GetMapping(value ="/add")
	public String addNewAirport(Model model) {
		model.addAttribute("airport", new Airport());
		return "/airport/airportForm";
	}
	
	//saving an airport to database
	@PostMapping(value ="/save")
	public String saveAirportToDB(@Valid @ModelAttribute ("airport") Airport airport) {
		airportService.save(airport);
		return "redirect:/allairports";
	}
	
	@GetMapping(value = "/allairports")
	public ModelAndView viewListOfAirports(Model model){
		List<Airport> airports = airportService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("airports", airports);
		modelAndView.setViewName("airport/airportList");
		model.addAttribute("Airport", airports);
		return modelAndView;
	}
	
	//deleting method
	@GetMapping(value = "/delete{id}")
	public void delete(Airport airport) {
		airportService.delete(airport);
	}
	
	//editing airport
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView editAirport(@PathVariable(name = "id") int id) {
		ModelAndView modelAndView = new ModelAndView("airport/edit");
		Airport airport = airportService.getAirport(id);
		modelAndView.addObject("airport", airport);
		return modelAndView;
	}
}
