package mum.edu.cs.cs425.flightManagemenetApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "mum.edu.cs.cs425.flightManagemenetApp")
public class FlightManagemenetAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightManagemenetAppApplication.class, args);
	}

}
