package com.cg.ima.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ima.entity.Requirement;

@Repository
public interface IRequirementRepository extends JpaRepository<Requirement, Integer> {

	
}