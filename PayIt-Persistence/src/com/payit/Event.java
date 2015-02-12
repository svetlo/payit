package com.payit;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity

public class Event implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Event() {
		super();
	}
   
	private int id;
	private String name;
	private Date date;
	private String description;
	private Date created;
	private Collection<ParticipantPaid> participants;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy="event")
	public Collection<ParticipantPaid> getParticipants() {
		return participants;
	}
	public void setParticipants(Collection<ParticipantPaid> participants) {
		this.participants = participants;
	}
	
	public void addParticipants(ParticipantPaid participant) {
		this.participants.add(participant);
	}
	
	public void removeParticipants(ParticipantPaid participant) {
		this.participants.remove(participant);
	}

}
