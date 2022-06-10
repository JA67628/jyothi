package com.jyothi.olx.service;

import java.util.List;

import com.jyothi.olx.Entity.Advertises;
import com.jyothi.olx.Entity.AdvertisesResponse;

public interface AdvertisesService {
      
	public AdvertisesResponse getNewAdvertise(Advertises advertises);
	
	public AdvertisesResponse updateAdvertise(int id,Advertises advertise);
	
	
	public List<AdvertisesResponse> getAllAdvertiseResponse();
	
	public AdvertisesResponse getById(int id);
	
	public boolean delete(int id);
}