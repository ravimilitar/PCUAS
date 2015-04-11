package models;

import java.io.Serializable;


public class Referrers implements Serializable {
	
	private String referrerid;
	private String userid;
	private String firstname;
	private String lastname;
	private String email;
	private String organization;
	private String position;
	private String mobile;
	
	public Referrers(){
		
	}
	
	public Referrers(String referrerid, String userid, String firstname, String lastname, String email, String organization, String position, String mobile){
		this.referrerid = referrerid;
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.organization = organization;
		this.position = position;
		this.mobile = mobile;
		
	}

	public String getReferrerid() {
		return referrerid;
	}

	public void setReferrerid(String referrerid) {
		this.referrerid = referrerid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
