package com.ramesh199.backend.dto;

public class Category {
	
	
	
	
	/* Private Fields */

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageurl(String imageURL) {
		this.imageURL = imageURL;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	private int id;
	private String name;
	private String description;
	private String imageURL;
	private Boolean active = true;
}
