package com.crud.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "EmployeeName")
	private String ename;
	@Column(name = "EmployeeMail")
	private String email;
	@Column(name = "Contact")
	private String mobile;
	@Column(name = "Post")
	private String designation;
	@Column(name = "EmployeeUsername")
	private String username;
	@Column(name = "EmployeePassword")
	private String password;
	
	public Employee() {
		super();
	}

	public Employee(int id, String ename, String email, String mobile, String designation, String username,
			String password) {
		super();
		this.id = id;
		this.ename = ename;
		this.email = email;
		this.mobile = mobile;
		this.designation = designation;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", ename=" + ename + ", email=" + email + ", mobile=" + mobile + ", designation="
//				+ designation + ", username=" + username + ", password=" + password + "]";
//	}	
}
