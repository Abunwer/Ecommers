package com.model;

import javax.persistence.Column;
import javax.persistence.Table;


@Table(name = "FavSuppliers")
public class FavSuppliers {
	@Column(name="CustomerID")
	private int Customer_ID;
	
	@Column(name="Suppliers_ID")
    private int Suppliers_ID;
	
	@Column(name="List_Counter")
    private int List_Counter;
	
	@Column(name="ListName")
    private String ListName;
	
	@Column(name="CrateDate")
    private String  CrateDate;
	
	@Column(name="privateorprivate")
    private int privateorprivate;
	
	@Column(name="Status")
    private int Status;

	public int getCustomer_ID() {
		return Customer_ID;
	}

	public void setCustomer_ID(int customer_ID) {
		Customer_ID = customer_ID;
	}

	public int getSuppliers_ID() {
		return Suppliers_ID;
	}

	public void setSuppliers_ID(int suppliers_ID) {
		Suppliers_ID = suppliers_ID;
	}

	public int getList_Counter() {
		return List_Counter;
	}

	public void setList_Counter(int list_Counter) {
		List_Counter = list_Counter;
	}

	public String getListName() {
		return ListName;
	}

	public void setListName(String listName) {
		ListName = listName;
	}

	public String getCrateDate() {
		return CrateDate;
	}

	public void setCrateDate(String crateDate) {
		CrateDate = crateDate;
	}

	public int getPrivateorprivate() {
		return privateorprivate;
	}

	public void setPrivateorprivate(int privateorprivate) {
		this.privateorprivate = privateorprivate;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	
}
