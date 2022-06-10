package com.jyothi.advertises.model;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ADVERTISES")
public class OlxAdvertises {
	@Override
	public String toString() {
		return "Advertises [id=" + id + ", title=" + title + ", category=" + category + ", status=" + status
				+ ", price=" + price + ", description=" + description + ", active=" + active + ", posted_by="
				+ posted_by + ", username=" + username + ", photo=" + Arrays.toString(photo) + ", createdate="
				+ createdate + ", modifydate=" + modifydate + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getPosted_by() {
		return posted_by;
	}

	public void setPosted_by(String posted_by) {
		this.posted_by = posted_by;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	@Column
	private String title; 
	@Column
	private int category; 
	@Column
	private int status; 
	@Column
	private double price; 
	@Column
	private String description;
	@Column
	private boolean active; 
	@Column
	private String posted_by; 
	@Column
	private String username;
	private byte[] photo; // blob
	@Column(name = "created_date")
	private LocalDate createdate; 
	
	public LocalDate getCreatedate() {
		return createdate;
	}

	public void setCreatedate(LocalDate createdate) {
		this.createdate = createdate;
	}

	public LocalDate getModifydate() {
		return modifydate;
	}

	public void setModifydate(LocalDate modifydate) {
		this.modifydate = modifydate;
	}

	@Column(name = "modified_date")
	private LocalDate modifydate; // date

}