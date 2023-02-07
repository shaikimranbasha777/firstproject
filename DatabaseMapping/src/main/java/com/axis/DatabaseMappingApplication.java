package com.axis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.axis.entity.Maneger;
import com.axis.entity.Team;
import com.axis.repository.ManegerRepository;
import com.axis.repository.TeamRepository;

@SpringBootApplication
public class DatabaseMappingApplication implements CommandLineRunner {
	
	@Autowired
	ManegerRepository manegerRepository;
	@Autowired
	TeamRepository teamRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Maneger manager = new Maneger();
        manager.setName("john");
        manager.setDesignation("hr");
        manager.setYearsOfExperience(17);
        
        
        List<Team> teams = new ArrayList<Team>();
        teams.add(new Team("hr", 12, manager));
        teams.add(new Team("tester", 14, manager));
        
        manager.setTeams(teams);
        
        //manegerRepository.save(manager);
        
        teamRepository.saveAll(teams);
		
	}

}
