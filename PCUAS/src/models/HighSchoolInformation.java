package models;

import java.io.Serializable;

public class HighSchoolInformation implements Serializable {
	
	private String hsinfoid;
	private String userid;
	private String schoolname;
	private String country;
	private String schoolyear;
	private String address;
	private String yearlevel;
	
	public HighSchoolInformation(){
		
	}
	
	public HighSchoolInformation(String hsinfoid, String userid, String schoolname, String country, String schoolyear, String address, String yearlevel){
		this.hsinfoid = hsinfoid;
		this.userid = userid;
		this.schoolname = schoolname;
		this.country = country;
		this.schoolyear = schoolyear;
		this.address = address;
		this.yearlevel = yearlevel;
		
		
	}

	public String getHsinfoid() {
		return hsinfoid;
	}

	public void setHsinfoid(String hsinfoid) {
		this.hsinfoid = hsinfoid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSchoolyear() {
		return schoolyear;
	}

	public void setSchoolyear(String schoolyear) {
		this.schoolyear = schoolyear;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getYearlevel() {
		return yearlevel;
	}

	public void setYearlevel(String yearlevel) {
		this.yearlevel = yearlevel;
	}

}
