package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.entity.Emplyee;

public interface EmplyeeRepository extends JpaRepository<Emplyee, Integer> {

}
