package com.jyothi.advertises.repository;

	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;

import com.jyothi.advertises.model.OlxAdvertises;


	public interface OlxAdvertisesRepository extends JpaRepository<OlxAdvertises, Integer>{
		List<OlxAdvertises> findAdvertisesByTitle(String title);
	}
