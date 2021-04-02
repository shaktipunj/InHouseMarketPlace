package com.cg.ima.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ima.constant.OfferConstant;
import com.cg.ima.dto.OfferDto;
import com.cg.ima.entity.Offer;
import com.cg.ima.exception.InvalidOfferException;
import com.cg.ima.repository.IOfferRepository;

@Service("offerservice")
@Transactional
public class IOfferServiceImpl implements IOfferService {

	@Autowired
	IOfferRepository offerrepo;

	@Override
	public int addOffer(OfferDto offerdto) {
		Offer offer = new Offer();
		offer.setOfferId(offer.getOfferId());
		offer.setPrice(offer.getPrice());
		offer.setIsAvailable(offer.getIsAvailable());
		offer.setAvailableUpto(offer.getAvailableUpto());
		offer.setResource(offer.getResource());
		Offer savedoffer = offerrepo.save(offer);
		return savedoffer.getOfferId();
	}

	@Override
	public Offer getOffer(int offerId) throws InvalidOfferException {
		// TODO Auto-generated method stub
		Optional<Offer> optoffer = offerrepo.findById(offerId);
		if (optoffer.isPresent()) {
			return optoffer.get();
		}
		throw new InvalidOfferException(OfferConstant.OFFER_NOT_FOUND);
	}

}
