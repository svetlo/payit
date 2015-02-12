package com.payit;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ParticipantPaid
 *
 */
@Entity

public class ParticipantPaid implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public ParticipantPaid() {
		super();
	}
	
	private int id;
	private double Paid;
	private Event event;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPaid() {
		return Paid;
	}
	public void setPaid(double paid) {
		Paid = paid;
	}

   @ManyToOne(targetEntity=Event.class)
   @JoinColumn(name="event")
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	
}
