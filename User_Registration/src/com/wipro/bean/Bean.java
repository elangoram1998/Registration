package com.wipro.bean;

public class Bean {
	String firstname;
	String lastnaame;
	String email;
	String userid;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Bean(String firstname, String lastnaame, String email, String userid) {
		super();
		this.firstname = firstname;
		this.lastnaame = lastnaame;
		this.email = email;
		this.userid = userid;
	}
	public Bean() {
		super();
	}
	public String getLastnaame() {
		return lastnaame;
	}
	public void setLastnaame(String lastnaame) {
		this.lastnaame = lastnaame;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

}
