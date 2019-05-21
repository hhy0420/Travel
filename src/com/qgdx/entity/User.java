package com.qgdx.entity;

public class User {

	private int userid;
	private String username;
	private String usersex;
	private String usertel;
	private int userage;
	private String password;
	public User(String password) {
		super();
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public String getUsersex() {
		return usersex;
	}
	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}
	public String getUsertel() {
		return usertel;
	}
	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}
	public int getUserage() {
		return userage;
	}
	public void setUserage(int userage) {
		this.userage = userage;
	}
	public User(int userid, String username, String usersex, String usertel, int userage) {
		super();
		this.userid = userid;
		this.username = username;
		this.usersex = usersex;
		this.usertel = usertel;
		this.userage = userage;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username +  ", usersex="
				+ usersex + ", usertel=" + usertel + ", userage=" + userage + ", password=" + password + "]";
	}
	
	
}
