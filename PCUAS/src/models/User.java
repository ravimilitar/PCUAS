package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

import objects.DatabaseQuery;



public class User implements Serializable{

	private String userid;
	private String username;
	private String password;
	private String email;
	
	public User(){
	
	}
	
	public User(String userid, String username, String password, String email) {
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
