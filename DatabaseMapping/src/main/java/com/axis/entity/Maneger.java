package com.axis.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Maneger {
	
	@Id
	@Column(name = "maneger_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String designation;
	private int yearsOfExperience;
	
	@OneToMany(mappedBy = "maneger" , targetEntity = Team.class)
	private List<Team> teams;
	
	public Maneger(String name, String designation, int yearsOfExperience, List<Team> teams) {
		super();
		this.name = name;
		this.designation = designation;
		this.yearsOfExperience = yearsOfExperience;
		this.teams = teams;
	}
	public Maneger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public List<Team> getTeams() {
	    return teams;
	}
	 
	public void setTeams(List<Team> teams) {
	    this.teams = teams;
	}
	 
	
	
	
}
