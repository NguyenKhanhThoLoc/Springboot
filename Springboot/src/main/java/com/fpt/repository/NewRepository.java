package com.fpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpt.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long>{
	
}