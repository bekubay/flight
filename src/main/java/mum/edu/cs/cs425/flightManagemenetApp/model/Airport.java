package mum.edu.cs.cs425.flightManagemenetApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Airports")
public class Airport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="airport_id", nullable = false, unique = true)
	@NotNull
	private Integer id;
	
	@NotNull
	private String code;
	private String name;
	private String city;
	private String state;
	
	//constructors
	public Airport() {
		super();
	}


	public Airport(String code, String name, String city, String sate) {
		super();
		this.code = code;
		this.name = name;
		this.city = city;
		this.state = sate;
	}

//getters and setters

	
	public Integer getId() {
		return id;
	}

	
	public void steId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getSate() {
		return state;
	}


	public void setSate(String sate) {
		this.state = sate;
	}
	

}
