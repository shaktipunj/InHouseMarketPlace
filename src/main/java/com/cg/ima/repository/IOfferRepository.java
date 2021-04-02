package com.cg.ima.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ima.entity.Employee;
import com.cg.ima.entity.Offer;
import com.cg.ima.exception.InvalidOfferException;

@Repository
public interface IOfferRepository extends JpaRepository<Offer, Integer> {

	
	
	
}
