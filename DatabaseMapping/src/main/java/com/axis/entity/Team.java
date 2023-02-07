package com.axis.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Team {
	
	@Id
	@Column(name = "team_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String teamName;
	private int noOfMembers;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "maneger_id")
	private Maneger maneger;
	
	public Team(String teamName, int noOfMembers, Maneger maneger) {
		super();
		this.teamName = teamName;
		this.noOfMembers = noOfMembers;
		this.maneger = maneger;
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getNoOfMembers() {
		return noOfMembers;
	}
	public void setNoOfMembers(int noOfMembers) {
		this.noOfMembers = noOfMembers;
	}
	public Maneger getManeger() {
        return maneger;
    }
 
    public void setManeger(Maneger maneger) {
        this.maneger = maneger;
    }
	
	
}
