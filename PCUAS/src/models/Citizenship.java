package models;

import java.io.Serializable;

public class Citizenship implements Serializable{
	
	private String citizenshipid;
	private String userid;
	private String citizenshipcountry;
	private String dualcitizenship;
	private String pobcity;
	private String pobprovince;
	private String pobcountry;
	

	public Citizenship(){
		
	}
	
	public Citizenship(String citizenshipid, String userid, String citizenshipcountry, String dualcitizenship, String pobcity, String pobprovince, String pobcountry){
		
		this.citizenshipid = citizenshipid;
		this.userid = userid;
		this.citizenshipcountry = citizenshipcountry;
		this.dualcitizenship = dualcitizenship;
		this.pobcity = pobcity;
		this.pobprovince = pobprovince;
		this.pobcountry = pobcountry;
		
	}


	public String getCitizenshipid() {
		return citizenshipid;
	}


	public void setCitizenshipid(String citizenshipid) {
		this.citizenshipid = citizenshipid;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getCitizenshipcountry() {
		return citizenshipcountry;
	}


	public void setCitizenshipcountry(String citizenshipcountry) {
		this.citizenshipcountry = citizenshipcountry;
	}


	public String getDualcitizenship() {
		return dualcitizenship;
	}


	public void setDualcitizenship(String dualcitizenship) {
		this.dualcitizenship = dualcitizenship;
	}


	public String getPobcity() {
		return pobcity;
	}


	public void setPobcity(String pobcity) {
		this.pobcity = pobcity;
	}


	public String getPobprovince() {
		return pobprovince;
	}


	public void setPobprovince(String pobprovince) {
		this.pobprovince = pobprovince;
	}


	public String getPobcountry() {
		return pobcountry;
	}


	public void setPobcountry(String pobcountry) {
		this.pobcountry = pobcountry;
	}
}
