package com.cg.ima.service;
import java.util.List;

import com.cg.ima.dto.OfferDto;
import com.cg.ima.entity.Employee;
import com.cg.ima.entity.Offer;
import com.cg.ima.exception.InvalidEmployeeException;
import com.cg.ima.exception.InvalidOfferException;

public interface IOfferService {
	
	//Offer addOffer(Offer offer);
	
	//Offer editOffer(Offer offer);
	
	Offer getOffer(int offerId) throws InvalidOfferException;

	int addOffer(OfferDto offerdto);
	
	//Offer removeOffer(int offerId) throws InvalidOfferException;
	
	//List<Offer> getAllOffers();
	
	//List<Offer> getAllOffers(String category, String type);
}

