package com.fpt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpt.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{
	CategoryEntity findOneByCode(String code);
}