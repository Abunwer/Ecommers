package com.model;

import javax.persistence.Column;
import javax.persistence.Table;


@Table(name = "Products")
public class Products {
	
	@Column(name="CategoryMainID")
	private int CategoryMainID ;
	
	@Column(name="CategorySubID")
    private int CategorySubID ;
	
	@Column(name="Supplier_ID")
    private int Supplier_ID;
	
	@Column(name="Branch_ID")
    private String Branch_ID;
	
	@Column(name="ProductID")
    private int ProductID ;
	
	@Column(name="ProductDescription")
    private String ProductDescription ;
	
	@Column(name="ProductAvailableQuantity")
    private int  ProductAvailableQuantity ;
	
	@Column(name="saleUnit")
    private String saleUnit;
	
	@Column(name="UnitPrice")
    private double UnitPrice;
	
	@Column(name="negotiable")
    private double negotiable;
	
	@Column(name="nameproduct")
    private String nameproduct;
	
	@Column(name="image")
    private String image ;

	public int getCategoryMainID() {
		return CategoryMainID;
	}

	public void setCategoryMainID(int categoryMainID) {
		CategoryMainID = categoryMainID;
	}

	public int getCategorySubID() {
		return CategorySubID;
	}

	public void setCategorySubID(int categorySubID) {
		CategorySubID = categorySubID;
	}

	public int getSupplier_ID() {
		return Supplier_ID;
	}

	public void setSupplier_ID(int supplier_ID) {
		Supplier_ID = supplier_ID;
	}

	public String getBranch_ID() {
		return Branch_ID;
	}

	public void setBranch_ID(String branch_ID) {
		Branch_ID = branch_ID;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public String getProductDescription() {
		return ProductDescription;
	}

	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}

	public int getProductAvailableQuantity() {
		return ProductAvailableQuantity;
	}

	public void setProductAvailableQuantity(int productAvailableQuantity) {
		ProductAvailableQuantity = productAvailableQuantity;
	}

	public String getSaleUnit() {
		return saleUnit;
	}

	public void setSaleUnit(String saleUnit) {
		this.saleUnit = saleUnit;
	}

	public double getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}

	public double getNegotiable() {
		return negotiable;
	}

	public void setNegotiable(double negotiable) {
		this.negotiable = negotiable;
	}

	public String getNameproduct() {
		return nameproduct;
	}

	public void setNameproduct(String nameproduct) {
		this.nameproduct = nameproduct;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	

}
