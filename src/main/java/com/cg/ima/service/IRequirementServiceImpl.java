package com.cg.ima.service;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ima.constant.ProposalConstant;
import com.cg.ima.constant.RequirementConstant;
import com.cg.ima.dto.ProposalDto;
import com.cg.ima.dto.RequirementDto;
import com.cg.ima.entity.Proposal;
import com.cg.ima.entity.Requirement;
import com.cg.ima.exception.InvalidProposalException;
import com.cg.ima.exception.InvalidRequirementException;
import com.cg.ima.repository.IProposalRepository;
import com.cg.ima.repository.IRequirementRepository;

@Service("requirementservice")
@Transactional
public class IRequirementServiceImpl implements IRequirementService {

	@Autowired
	IRequirementRepository requirementrepo;

	
	@Override
	public int addRequirement(RequirementDto requirementdto) {

		Requirement requirement= new Requirement();
		requirement.setReqId(requirement.getReqId());
		//requirement.setFulfilled();
		requirement.setFulfilledOn(requirement.getFulfilledOn());
		
		Requirement savedrequirement = requirementrepo.save(requirement);
		return savedrequirement.getReqId();

	}

	@Override
	public Requirement getRequirement(int requirementId) throws InvalidRequirementException {
		// TODO Auto-generated method stub
		Optional<Requirement> optrequirement = requirementrepo.findById(requirementId);
		if (optrequirement.isPresent()) {
			return optrequirement.get();
		}
		throw new InvalidRequirementException(RequirementConstant.REQUIREMENT_NOT_FOUND);
	}


}

