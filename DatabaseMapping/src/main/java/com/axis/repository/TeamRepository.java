package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {

}
