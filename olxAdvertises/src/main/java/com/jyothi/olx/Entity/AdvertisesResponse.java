package com.jyothi.olx.Entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertisesResponse {
    private int id;
  
  private String title;
  
  private double price;
  
  private String category;
  
  private String description;
  
  private String username;
  
  private Date createdDate;
  
  private Date modifiedDate;
  
  private String status;
 
  
  
  
  
  
  
  
  
  
  
}


