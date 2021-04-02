package com.cg.ima.service;

import java.util.List;

import javax.validation.Valid;

import com.cg.ima.dto.RequirementDto;
import com.cg.ima.entity.Requirement;
import com.cg.ima.exception.InvalidProposalException;
import com.cg.ima.exception.InvalidRequirementException;

public interface IRequirementService {

	// Requirement addRequirement(Requirement req);

	// Requirement editRequirement(Requirement req);

	// Requirement getRequirement(int reqId) throws InvalidRequirementException;

	// Requirement removeRequirement(int reqId) throws InvalidRequirementException;

	// List<Requirement> getAllRequirements();

	// List<Requirement> getAllRequirements(String category, String type);

	Requirement getRequirement(int requirementId) throws InvalidRequirementException;

	int addRequirement(@Valid RequirementDto requirementdto);
}
