package com.cg.ima.service;

import java.time.LocalDate;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ima.constant.EmployeeConstant;
import com.cg.ima.constant.ProposalConstant;
import com.cg.ima.constant.RequirementConstant;
import com.cg.ima.constant.ResourceConstant;
import com.cg.ima.dto.ProposalDto;
import com.cg.ima.entity.Proposal;
import com.cg.ima.entity.Requirement;
import com.cg.ima.entity.Resource;
import com.cg.ima.exception.InvalidProposalException;
import com.cg.ima.exception.InvalidRequirementException;
import com.cg.ima.exception.InvalidResourceException;
import com.cg.ima.repository.IProposalRepository;
import com.cg.ima.repository.IRequirementRepository;
import com.cg.ima.repository.IResourceRepository;

@Service 
@Transactional
public class IProposalServiceImpl implements IProposalService{
	@Autowired
 private IProposalRepository proposalrepo;
	@Autowired
	private IRequirementRepository reqrepo;
	@Autowired
	private IResourceRepository resourcerepo;
	@Override
	public Proposal addProposal(ProposalDto proposaldto) throws InvalidRequirementException, InvalidResourceException  {
		Optional<Requirement> optreq= reqrepo.findById(proposaldto.getRequirementId());
		if (optreq.isEmpty()) {
				throw new InvalidRequirementException(RequirementConstant.REQUIREMENT_NOT_FOUND);
		}
		Optional<Resource> optres= resourcerepo.findById(proposaldto.getResourceId());
		if(optres.isEmpty()) {
			throw new InvalidResourceException(ResourceConstant.RESOURCE_NOT_FOUND);
		}
		Proposal proposal= new Proposal();
		proposal.setProposal(proposaldto.getProposal());
		proposal.setAmount(proposaldto.getAmount());
		proposal.setProposalDate(LocalDate.now());
		proposal.setResource(optres.get());
		proposal.setRequirement(optreq.get());
		Proposal newproposal= proposalrepo.save(proposal);
		// TODO Auto-generated method stub
		return newproposal;
	}
	@Override
	public Proposal getProposal(int propId) throws InvalidProposalException {
	Optional<Proposal> optproposal= proposalrepo.findById(propId);
	if(optproposal.isEmpty()) {
		throw new InvalidProposalException(ProposalConstant.PROPOSAL_NOT_FOUND);
	}
		// TODO Auto-generated method stub
		return optproposal.get();
	}
	

}