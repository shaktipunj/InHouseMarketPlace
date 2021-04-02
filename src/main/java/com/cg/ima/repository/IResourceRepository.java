package com.cg.ima.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ima.entity.Requirement;
import com.cg.ima.entity.Resource;
import com.cg.ima.exception.InvalidEmployeeException;

@Repository
public interface IResourceRepository extends JpaRepository<Resource, Integer> {

	//Optional<Resource> findAllById(int resourceId);


	
}
