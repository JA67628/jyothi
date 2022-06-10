package com.jyothi.olx.Entity;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ADVERTISES")
public class Advertises {
  @Id
   private int id;
  
  @Column(name="title")
  private String title;
  
  @Column(name="category")
  private int category;
  
  @Column(name="status")
  private int status;
  
  @Column(name="price")
  private double price;
  
  @Column(name="description")
  private String description;
  
  @Column(name="photo")
  private Blob photo;
  
  @Column(name="created_date")
  private Date createdDate;
  
  @Column(name="modified_date")
  private Date modifiedDate;
  
  @Column(name="active")
  private boolean active;
  
  @Column(name="posted_by")
  private String posted_by;
  
  @Column(name="username")
  private  String username;
  
  
  
  
  
  
  
  
  
  
}








