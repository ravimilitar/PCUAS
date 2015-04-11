package models;

import java.io.Serializable;

public class GeneralUserInformation implements Serializable{
	
	private String guserinfoid;
	private String userid;
	private String firstname;
	private String lastname;
	private String middlename;
	private String nickname;
	private String gender;
	private String birthdate;
	private String religion;
	private String civilstatus;
	private String birthmonth;
	private String birthday;
	private String birthyear;
	private String livingwithparents;
	
	public GeneralUserInformation(){
		
	}
	
	public GeneralUserInformation(String guserinfoid, String userid, 
			String firstname, String lastname, String middlename, 
			String nickname, String gender, String religion, 
			String civilstatus, String birthday, String birthmonth, 
			String birthyear, String livingwithparents){
		
		this.guserinfoid = guserinfoid;
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.middlename = middlename;
		this.nickname = nickname;
		this.gender = gender;
		this.religion = religion;
		this.civilstatus = civilstatus;
		this.birthday = birthday;
		this.birthmonth = birthmonth;
		this.birthyear = birthyear;
		this.livingwithparents = livingwithparents;
		
		birthdate = birthyear + "-" + birthmonth + "-" + birthday;
	}

	public String getGuserinfoid() {
		return guserinfoid;
	}

	public void setGuserinfoid(String guserinfoid) {
		this.guserinfoid = guserinfoid;
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

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
		birthyear = birthdate.substring(0, 4);
		birthmonth = birthdate.substring(5, 7);
		birthday = birthdate.substring(8);
		
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
		birthdate = birthyear + "-" + birthmonth + "-" + birthday;
	}

	public String getBirthmonth() {
		return birthmonth;
	}

	public void setBirthmonth(String birthmonth) {
		this.birthmonth = birthmonth;
		birthdate = birthyear + "-" + birthmonth + "-" + birthday;
	}
	

	public String getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(String birthyear) {
		this.birthyear = birthyear;
		birthdate = birthyear + "-" + birthmonth + "-" + birthday;
	}

	

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCivilstatus() {
		return civilstatus;
	}

	public void setCivilstatus(String civilstatus) {
		this.civilstatus = civilstatus;
	}

	public String getLivingwithparents() {
		return livingwithparents;
	}

	public void setLivingwithparents(String livingwithparents) {
		this.livingwithparents = livingwithparents;
	}


}
