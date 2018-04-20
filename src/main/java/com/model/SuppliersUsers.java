package com.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "Suppliers_Users")
public class SuppliersUsers {
	
	@Column(name="Suppliers_ID")
	private int suppliers ;
	
	@Column(name="Branch_ID")
    private String Branch_ID ;
	
	@Column(name="User_ID")
    private String User_ID ;
	
	@Column(name="Employee_Name")
    private String Employee_Name ;
	
	@Column(name="Data_Of_Birth")
    private String Data_Of_Birth ;
	
	@Column(name="Gender")
    private String Gender ;
	
	@Column(name="Username")
    private String username ;
	
	@Column(name="Password")
    private String Password ;
	
	@Column(name="Cell_Phone")
    private String Cell_Phone ;
	
	
    
    public int getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(int suppliers) {
		this.suppliers = suppliers;
	}
	public String getBranch_ID() {
		return Branch_ID;
	}
	public void setBranch_ID(String branch_ID) {
		Branch_ID = branch_ID;
	}
	public String getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(String user_ID) {
		User_ID = user_ID;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}
	public String getData_Of_Birth() {
		return Data_Of_Birth;
	}
	public void setData_Of_Birth(String data_Of_Birth) {
		Data_Of_Birth = data_Of_Birth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getCell_Phone() {
		return Cell_Phone;
	}
	public void setCell_Phone(String cell_Phone) {
		Cell_Phone = cell_Phone;
	}
}
