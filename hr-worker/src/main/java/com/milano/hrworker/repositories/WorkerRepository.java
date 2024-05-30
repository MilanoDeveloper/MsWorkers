package com.milano.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milano.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	
	
	
}
