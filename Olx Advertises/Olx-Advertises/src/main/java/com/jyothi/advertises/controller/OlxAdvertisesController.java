package com.jyothi.advertises.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jyothi.advertises.model.OlxAdvertises;
import com.jyothi.advertises.service.OlxAdvertisesService;

@RestController
public class OlxAdvertisesController {
	@Autowired
	OlxAdvertisesService advservice;

	// To add new advertises
	@PostMapping("/advertise")
	public OlxAdvertises newAdvertise(@RequestBody OlxAdvertises advertise) {
		return advservice.newAdvertise(advertise);
	}

	// To update existing advertise
	@PutMapping("/advertise/{id}")
	public OlxAdvertises updateAdvertise(@RequestBody OlxAdvertises ad, @PathVariable Integer id) {
		return advservice.updateAdvertise(ad, id);
	}

	// To read all the advertise posted by logged in user
	@GetMapping("/user/advertise")
	public List<OlxAdvertises> getAllAdvertises() {
		return advservice.getAllAdvertises();
	}

	// Deletes specific advertisement posted by logged in user
	@DeleteMapping("/user/advertise/{postId}")
	public boolean deleteAdvertiseById(@PathVariable("id") Integer id) {
		return advservice.deleteAdvertiseById(id);
	}

	// Get Advertise by id
	@RequestMapping("/advertise/{postId}")
	public OlxAdvertises getAdvertisesById(@PathVariable Integer id) {
		return advservice.getAdvertisesById(id);
	}
}