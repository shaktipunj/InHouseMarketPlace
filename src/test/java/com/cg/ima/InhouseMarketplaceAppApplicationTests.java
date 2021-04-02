package com.cg.ima;

import java.util.Optional;

import org.checkerframework.checker.nullness.Opt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.ima.entity.Employee;
import com.cg.ima.entity.Offer;
import com.cg.ima.entity.Proposal;
import com.cg.ima.entity.Requirement;
import com.cg.ima.entity.Resource;
import com.cg.ima.exception.InvalidEmployeeException;
import com.cg.ima.exception.InvalidOfferException;
import com.cg.ima.exception.InvalidProposalException;
import com.cg.ima.exception.InvalidRequirementException;
import com.cg.ima.exception.InvalidResourceException;
import com.cg.ima.repository.IEmployeeRepository;
import com.cg.ima.repository.IOfferRepository;
import com.cg.ima.repository.IProposalRepository;
import com.cg.ima.repository.IRequirementRepository;
import com.cg.ima.repository.IResourceRepository;
import com.cg.ima.service.IEmployeeService;
import com.cg.ima.service.IEmployeeServiceImpl;
import com.cg.ima.service.IOfferServiceImpl;
import com.cg.ima.service.IProposalServiceImpl;
import com.cg.ima.service.IRequirementService;
import com.cg.ima.service.IResourceService;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
@SpringBootTest
public class InhouseMarketplaceAppApplicationTests {
	public static Optional<Employee> optemployee;
	@MockBean
	private IEmployeeRepository employeerepo;
	@Autowired
	private IEmployeeService employeeser;

	@BeforeEach
	public void beforeeach() {
		optemployee = Optional.of(new Employee());
		Mockito.when(employeerepo.findById(2)).thenReturn(optemployee);
		Mockito.when(employeerepo.findById(100)).thenThrow(InvalidEmployeeException.class);
	}

	@Test
	public void testEmployeeById_01() throws InvalidEmployeeException {
		// Employee employee = employeeser.getEmployee(3);
		assertNotNull(employeeser.getEmployee(2));

	}

	public void testEmployeeById_02() {
		assertThrows(InvalidEmployeeException.class, () -> employeeser.getEmployee(100));
	}

	//RESOURCE TEST CASES
	
	public static Optional<Resource> optresource;
	@MockBean
	private IResourceRepository resourcerepo;
	@Autowired
	private IResourceService resourceser;

	@BeforeEach
	public void beforeeach1() {
		optresource = Optional.of(new Resource());
		Mockito.when(resourcerepo.findById(2)).thenReturn(optresource);
		Mockito.when(resourcerepo.findById(100)).thenThrow(InvalidResourceException.class);
	}

	@Test
	public void testResourceById_01() throws InvalidResourceException {
		// Employee employee = employeeser.getEmployee(3);
		assertNotNull(resourceser.getAllResource(2));

	}
	//REQUIREMENT TEST CASES

	public void testResourceById_02() {
		assertThrows(InvalidResourceException.class, () -> resourceser.getAllResource(100));
	}
	public static Optional<Requirement> optrequirement;
	@MockBean
	private IRequirementRepository requirementrepo;
	@Autowired
	private IRequirementService requirementser;

	@BeforeEach
	public void beforeeach2() {
		optrequirement = Optional.of(new Requirement());
		Mockito.when(requirementrepo.findById(2)).thenReturn(optrequirement);
		Mockito.when(requirementrepo.findById(100)).thenThrow(InvalidRequirementException.class);
	}

	@Test
	public void testrequirementById_03() throws InvalidRequirementException {
		// Employee employee = employeeser.getEmployee(3);
		assertNotNull(requirementser.getRequirement(2));

	}

	public void testrequirementById_04() {
		assertThrows(InvalidRequirementException.class, () -> requirementser.getRequirement(100));
	}
	
	// PROPOSAL TEST CASES
	public static Optional<Proposal> optproposal;

	@MockBean
	private IProposalRepository proposalrepo;
	@Autowired
	private IProposalServiceImpl proposalser;

	@BeforeEach
	public void beforeeach11() {
		optproposal = Optional.of(new Proposal());
		Mockito.when(proposalrepo.findById(2)).thenReturn(optproposal);
		Mockito.when(proposalrepo.findById(100)).thenThrow(InvalidProposalException.class);
	}

	@Test
	public void testProposalById_01() throws InvalidProposalException {
		
		assertNotNull(proposalser.getProposal(2));

	}

	public void testProposalById_02() {
		assertThrows(InvalidProposalException.class, () -> proposalser.getProposal(100));
	}
//OFFER TEST CASE
//	public static Optional<Offer> optoffer;
//
//	@MockBean
//	private IOfferRepository offerrepo;
//	@Autowired
//	private IOfferServiceImpl offerser;
//
//	@BeforeEach
//	public void beforeeach111() {
//		optoffer = Optional.of(new Offer());
//		Mockito.when(offerrepo.findById(5)).thenReturn(optoffer);
//		Mockito.when(proposalrepo.findById(100)).thenThrow(InvalidOfferException.class);
//	}
//
//	@Test
//	public void testOfferById_01() throws InvalidOfferException {
//		
//		assertNotNull(offerser.getOffer(2));
//
//	}
//
//	public void testOfferById_02() {
//		assertThrows(InvalidOfferException.class, () -> offerser.getOffer(100));
//	}
}

