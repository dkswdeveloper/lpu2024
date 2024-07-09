package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Player {
	@SequenceGenerator(name="playerseq", initialValue = 501)
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "playerseq")
	private int playerid;
	
	private String name;
	
	@OneToOne //automatically generate Foreign Key in Player table 
	PlayerKit kit;
	
	@ManyToOne
	@JoinColumn(name="teamid")
	Team team;

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", name=" + name + "]";
	}

	public PlayerKit getKit() {
		return kit;
	}

	public void setKit(PlayerKit kit) {
		this.kit = kit;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	
}
