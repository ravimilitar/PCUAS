package models;

import java.io.Serializable;

public class ContactDetails implements Serializable {
	
	private String contactid;
	private String userid;
	private String mobilephone;
	

	public ContactDetails(){
		
	}

	public ContactDetails(String contactid, String userid, String mobilephone){
		this.contactid = contactid;
		this.userid = userid;
		this.mobilephone = mobilephone;
		
	}

	public String getContactid() {
		return contactid;
	}


	public void setContactid(String contactid) {
		this.contactid = contactid;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getMobilephone() {
		return mobilephone;
	}


	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	
	
}
