package com.jyothi.olx.reprositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jyothi.olx.Entity.Advertises;

@Repository
public interface AdvertisesReprositry extends JpaRepository<Advertises, Integer> {

//	@Query("Select a from ADVERTISES a WHERE a.category= ?1 OR a.postedBy=?1 OR a.title=1? OR a.price < ?1")
//	
//	 List<Advertises> FindByCritera(@Param("search") Advertises search);
	
}
