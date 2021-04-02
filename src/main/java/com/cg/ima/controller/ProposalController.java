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
import com.cg.ima.constant.ProposalConstant;
import com.cg.ima.dto.OfferDto;
import com.cg.ima.dto.ProposalDto;
import com.cg.ima.dto.SuccessMessageDto;
import com.cg.ima.entity.Offer;
import com.cg.ima.entity.Proposal;
import com.cg.ima.exception.InvalidOfferException;
import com.cg.ima.exception.InvalidProposalException;
import com.cg.ima.exception.InvalidRequirementException;
import com.cg.ima.exception.InvalidResourceException;
import com.cg.ima.exception.ValidateException;
import com.cg.ima.service.IOfferService;
import com.cg.ima.service.IProposalService;

@RestController
public class ProposalController {

	@Autowired
	private IProposalService proposalser;
	@PostMapping("addproposal")
	public SuccessMessageDto addProposal(@Valid @RequestBody ProposalDto proposaldto, BindingResult br) throws ValidateException, InvalidRequirementException, InvalidResourceException
	{
		if(br.hasErrors()) 
			throw new ValidateException(br.getFieldErrors());
		Proposal id=proposalser.addProposal(proposaldto);
		return new SuccessMessageDto(ProposalConstant.PROPOSAL_ADDED + id.getRequirement().getReqId());
	}
	@GetMapping("getproposalbyid/{proposalid}")
	public Proposal getProposal(@PathVariable (name="proposalid") int proposalId) throws InvalidProposalException
	{
		return proposalser.getProposal(proposalId);
	}
}
