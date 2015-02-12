package com.payit;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: BillingTransaction
 *
 */
@Entity

public class BillingTransaction implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public BillingTransaction() {
		super();
	}
   
	private int id;
	private double debt;
	private User creditor;
	private User debitor;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDebt() {
		return debt;
	}
	public void setDebt(double debt) {
		this.debt = debt;
	}
	
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="debitor")
	public User getDebitor() {
		return debitor;
	}
	public void setDebitor(User debitor) {
		this.debitor = debitor;

	}
	
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="creditor")
	public User getCreditor() {
		return creditor;
	}
	public void setCreditor(User creditor) {
		this.creditor = creditor;
	}
	
}
