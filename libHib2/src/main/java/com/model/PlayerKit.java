package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="playerkit")
public class PlayerKit { // table name : player_kit, playerkit , playerKit, 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int kitid;
	
	@Column(name="numbats")
	Integer numBats; // it can be null in DB
//	int numBats; //never be null in database
	
	public int getKitid() {
		return kitid;
	}
	public void setKitid(int kitid) {
		this.kitid = kitid;
	}
	public Integer getNumBats() {
		return numBats;
	}
	public void setNumBats(Integer numBats) {
		this.numBats = numBats;
	}
	@Override
	public String toString() {
		return "PlayerKit [kitid=" + kitid + ", numBats=" + numBats + "]";
	}
	
}
