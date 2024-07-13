package com.example.railway.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;

@Entity
@Table(name = "railways") 
public class Railway {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String name;

    @NotBlank
    @Column(nullable = false)
    private String category;

    @NotNull
    @Column(nullable = false)
    private LocalTime startTime;

    @NotNull
    @Column(nullable = false)
    private LocalTime endTime;

    @NotBlank
    @Column(nullable = false)
    private String source;

    @NotBlank
    @Column(nullable = false)
    private String destination;

    @NotBlank
    @Column(nullable = false)
    private String stationCode;

    @NotNull
    @Column(nullable = false)
    private Double distance;

    @NotBlank
    @Column(nullable = false)
    private String frequency;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

    
}
