package com.packtpub.pfbg.model;

import java.util.Date;

public class User {
	
	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private Date dob;
	
	public User() {
	}

	public User(Integer id, String username, String password, String firstName) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
	}

	public User(Integer id, String username, String password, String firstName,
			String lastName, String email, String phone, Date dob) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", phone=" + phone + ", dob="
				+ dob + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
}
