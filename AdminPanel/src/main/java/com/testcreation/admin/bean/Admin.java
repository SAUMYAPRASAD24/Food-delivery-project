package com.testcreation.admin.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	Integer id;
	String email;
	String password;
	String LevelOfAccess;

	public Admin(Integer id, String username, String password, String LevelOfAccess) {
			//super();
			this.id = id;
			this.email = email;
			this.password = password;
			this.LevelOfAccess = LevelOfAccess;
		}
		
		public Admin() {}
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
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

		public String getLevelOfAccess() {
			return LevelOfAccess;
		}

		public void setLevelOfAccess(String levelOfAccess) {
			LevelOfAccess = levelOfAccess;
		}
		
		@Override
		public String toString() {
			return "Admin [id=" + id + ", email=" + email + ", password=" + password + ", LevelOfAccess=" + LevelOfAccess
					+ "]";
		}
}

