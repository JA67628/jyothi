package com.jyothi.olx.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jyothi.olx.Entity.Advertises;
import com.jyothi.olx.Entity.AdvertisesResponse;
import com.jyothi.olx.service.AdvertisesService;

@RestController
@RequestMapping("/advertise")
public class AdvertiseControler {
	
	@Autowired
	AdvertisesService advertiseservice;
	
	@PostMapping
	 ResponseEntity<AdvertisesResponse> getNewAdvertises(@RequestBody Advertises advertises){
		return new ResponseEntity<>(advertiseservice.getNewAdvertise(advertises),HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	ResponseEntity<AdvertisesResponse> updateAdvertise(@PathVariable int id, @RequestBody Advertises advertises ){
		return new ResponseEntity<>(advertiseservice.updateAdvertise(id, advertises),HttpStatus.CREATED);
	}
	
	@GetMapping
	ResponseEntity<List<AdvertisesResponse>> getAllAdvertiseResponse(){
		return new ResponseEntity<>(advertiseservice.getAllAdvertiseResponse(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	ResponseEntity<AdvertisesResponse> getIdAdvetise(@PathVariable int id){
		return new ResponseEntity<>(advertiseservice.getById(id),HttpStatus.OK);
	}
    
	@DeleteMapping("/{id}")
	ResponseEntity<Boolean> delete(@PathVariable int id){
		return new ResponseEntity<>(advertiseservice.delete(id),HttpStatus.OK);
	}
//	@GetMapping("/{search}")
//	ResponseEntity<List<Advertises>> getByFilter(@RequestParam(value="search") Advertises search){
//		return new ResponseEntity<>(advertiseservice.getByCritera(search),HttpStatus.OK);
//	}
	
}
