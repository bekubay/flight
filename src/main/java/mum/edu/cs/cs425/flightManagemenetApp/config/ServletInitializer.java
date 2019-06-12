package mum.edu.cs.cs425.flightManagemenetApp.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import mum.edu.cs.cs425.flightManagemenetApp.FlightManagemenetAppApplication;

public class ServletInitializer extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FlightManagemenetAppApplication.class);
	}
}
