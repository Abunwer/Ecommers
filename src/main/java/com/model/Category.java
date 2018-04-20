package com.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="category")
public class Category {
	@Column(name="CategoryMainID")
	private int categoryMainID;
	
	@Column(name="CategorySubID")
	private int categorySubID;
	
	@Column(name="CategoryName")
	private String categoryName;
	
	@Column(name="CategoryImage")
	private String categoryImage;
	
	@Column(name="CategoryDesc")
	private String categoryDesc;
	
	@Column(name="Flag")
	private int flag;
	
	@Column(name="SupplierID")
	private int supplierID;
	
	
	public int getCategoryMainID() {
		return categoryMainID;
	}
	public void setCategoryMainID(int categoryMainID) {
		this.categoryMainID = categoryMainID;
	}
	public int getCategorySubID() {
		return categorySubID;
	}
	public void setCategorySubID(int categorySubID) {
		this.categorySubID = categorySubID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryImage() {
		return categoryImage;
	}
	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public int getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}
	
	
}
