package com.jyothi.advertises.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jyothi.advertises.model.OlxAdvertises;
import com.jyothi.advertises.repository.OlxAdvertisesRepository;


@Service
public class OlxAdvertisesServiceImpl implements OlxAdvertisesService{
	@Autowired
	OlxAdvertisesRepository advrepo;

	// To add new advertises
	@Override
	public OlxAdvertises newAdvertise(OlxAdvertises ad) {

		OlxAdvertises adv = advrepo.save(ad);
		return adv;
	}

	// To update existing advertise
	@Override
	public OlxAdvertises updateAdvertise(OlxAdvertises ad, Integer id) {
		Optional<OlxAdvertises> advertise = advrepo.findById(id);
		if (advertise != null) {
			return advrepo.save(ad);
		}
		return null;

	}

	// To read all the advertise posted by logged in user
	@Override
	public List<OlxAdvertises> getAllAdvertises() {
		return advrepo.findAll();
	}

	// Deletes specific advertisement posted by logged in user
	@Override
	public boolean deleteAdvertiseById(Integer id) {

		advrepo.deleteById(id);
		if (advrepo.findById(id) != null) {
			return false;
		}
		return true;
	}

	// Matches advertisements using the provided 'searchText' within all fields
	// of an advertise.
	@Override
	public OlxAdvertises getAdvertiseByText(String text) {
		OlxAdvertises advertise = ((OlxAdvertisesServiceImpl) advrepo).getAdvertiseByText(text);
		return advertise;
	}

	// Get Advertise by id
	@Override
	public OlxAdvertises getAdvertisesById(Integer id) {
		Optional<OlxAdvertises> advertise = advrepo.findById(id);
		if (advertise.isPresent()) {
			return advertise.get();
		} else {
			return null;
		}

	}

}