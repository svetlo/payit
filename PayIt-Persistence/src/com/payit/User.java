package com.payit;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;


/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String login;
    private String name;
    private String surname;
    private String email;
    private String password;
    private Date created;
    private Collection<Billing> billingDebitors;
    private Collection<Billing> billingCreditors;
	
	public User() {
		super();
	}
   
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int getId(){return id;}
	public void setId(int id){this.id = id;}
	
	public String getLogin(){ return login;}
	public void setLogin(String login){this.login=login;}
	
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

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	/*
	@OneToMany(cascade = CascadeType.ALL, mappedBy="debitor")
	public Collection<Billing> getBillingDebitors() {
		return billingDebitors;
	}

	public void setBillingDebitors(Collection<Billing> billingDebitors) {
		this.billingDebitors = billingDebitors;
	}
	
	public void addBillingDebitors(Billing bill){this.billingDebitors.add(bill);}
	
	public void removeBillingDebitors(Billing bill){this.billingDebitors.remove(bill);}

	@OneToMany(cascade = CascadeType.ALL, mappedBy="creditor")
	public Collection<Billing> getBillingCreditors() {
		return billingCreditors;
	}

	public void setBillingCreditors(Collection<Billing> userCreditor) {
		this.billingCreditors = userCreditor;
	}
	
	public void addBillingCreditors (Billing bill) {this.billingCreditors.add(bill);}
	public void removeBillingCreditors (Billing bill) {this.billingCreditors.remove(bill);}
*/
	}
