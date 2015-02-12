package com.payit;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CreateUser {
	
	private String login;
	private String name;
	private String surname;
	private String email;
	private String password;
	private String passwordRepeat;
	
	public String getLogin() {
		return login;
	}
	public String getPasswordRepeat() {
		return passwordRepeat;
	}
	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void onClick_CreateUser (){
		
		
	}
	

}
