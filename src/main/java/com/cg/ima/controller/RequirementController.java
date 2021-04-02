package com.cg.ima.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ima.constant.ProposalConstant;
import com.cg.ima.constant.RequirementConstant;
import com.cg.ima.dto.ProposalDto;
import com.cg.ima.dto.RequirementDto;
import com.cg.ima.dto.SuccessMessageDto;
import com.cg.ima.entity.Proposal;
import com.cg.ima.entity.Requirement;
import com.cg.ima.exception.InvalidProposalException;
import com.cg.ima.exception.InvalidRequirementException;
import com.cg.ima.exception.ValidateException;
import com.cg.ima.service.IProposalService;
import com.cg.ima.service.IRequirementService;

@RestController
public class RequirementController {

	@Autowired
	private IRequirementService requirementser;
	@PostMapping("addrequirement")
	public SuccessMessageDto addRequirement(@Valid @RequestBody RequirementDto requirementdto, BindingResult br) throws ValidateException
	{
		if(br.hasErrors()) 
			throw new ValidateException(br.getFieldErrors());
		int id=requirementser.addRequirement(requirementdto);
		return new SuccessMessageDto(RequirementConstant.REQUIREMENT_ADDED + id);
	}
	@GetMapping("getrequirementbyid/{reqlid}")
	public Requirement getRequirement(@PathVariable (name="reqlid") int requirementId) throws InvalidRequirementException
	{
		return  requirementser.getRequirement(requirementId);
	}
}
