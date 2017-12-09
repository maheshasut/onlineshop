package com.shopbackend.dto;

public class Category {

	
	/*
	 * Private Fields Here
	 */
	private int id;
	private String name;
	private String desc;
	private String imgageUrl;
	private boolean active=true;
	
	
	/*
	 * Getter And Setter Menthods
	 */
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getImgageUrl() {
		return imgageUrl;
	}
	public void setImgageUrl(String imgageUrl) {
		this.imgageUrl = imgageUrl;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
	
	
}
