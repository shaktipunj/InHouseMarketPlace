package com.cg.ima.service;
import java.util.List;

import com.cg.ima.dto.ProposalDto;
import com.cg.ima.entity.Proposal;
import com.cg.ima.exception.InvalidProposalException;
import com.cg.ima.exception.InvalidRequirementException;
import com.cg.ima.exception.InvalidResourceException;
import com.cg.ima.exception.ValidateException;

public interface IProposalService {

	Proposal addProposal(ProposalDto proposalDto) throws InvalidRequirementException, InvalidResourceException;
//	Proposal editProposal(Proposal prop);
	
	Proposal getProposal(int propId) throws InvalidProposalException;
	
//	Proposal removeProposal(int propId) throws InvalidProposalException;
	
//	List<Proposal> getAllProposals();
}