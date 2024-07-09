package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {

		@Id
		private int teamid;
		String name;
		public int getTeamid() {
			return teamid;
		}
		public void setTeamid(int teamid) {
			this.teamid = teamid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Team [teamid=" + teamid + ", name=" + name + "]";
		}
		
}
