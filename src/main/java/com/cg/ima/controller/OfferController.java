package com.cg.ima.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ima.constant.EmployeeConstant;
import com.cg.ima.constant.OfferConstant;
import com.cg.ima.dto.EmployeeDto;
import com.cg.ima.dto.OfferDto;
import com.cg.ima.dto.SuccessMessageDto;
import com.cg.ima.entity.Employee;
import com.cg.ima.entity.Offer;
import com.cg.ima.exception.InvalidEmployeeException;
import com.cg.ima.exception.InvalidOfferException;
import com.cg.ima.exception.ValidateException;
import com.cg.ima.service.IEmployeeService;
import com.cg.ima.service.IOfferService;

	@RestController
	public class OfferController {

		@Autowired
		private IOfferService offerser;
		@PostMapping("addoffer")
		public SuccessMessageDto addOffer(@Valid @RequestBody OfferDto offerdto, BindingResult br) throws ValidateException
		{
			if(br.hasErrors()) 
				throw new ValidateException(br.getFieldErrors());
			int id=offerser.addOffer(offerdto);
			return new SuccessMessageDto(OfferConstant.OFFER_ADDED + id);
		}
		@GetMapping("getofferbyid/{offerid}")
		public Offer getOffer(@PathVariable (name="offerid") int offerId) throws InvalidOfferException
		{
			return offerser.getOffer(offerId);
		}
		
	}

