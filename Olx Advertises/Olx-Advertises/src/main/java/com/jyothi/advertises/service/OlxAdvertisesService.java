package com.jyothi.advertises.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jyothi.advertises.model.OlxAdvertises;


@Service
public interface OlxAdvertisesService {
	public OlxAdvertises newAdvertise(OlxAdvertises ad);

	// To update existing advertise
	public OlxAdvertises updateAdvertise(OlxAdvertises ad, Integer id);

	// To read all the advertise posted by logged in user
	public List<OlxAdvertises> getAllAdvertises();

	// Reads specific advertisement posed by logged in user

	// Deletes specific advertisement posted by logged in user
	public boolean deleteAdvertiseById(Integer id);

	// Search advertisements based upon given filter criteria
	// Matches advertisements using the provided 'searchText' within all fields
	// of an advertise.
	public OlxAdvertises getAdvertiseByText(String text);

	// Get Advertise by id
	public OlxAdvertises getAdvertisesById(Integer id);
}
