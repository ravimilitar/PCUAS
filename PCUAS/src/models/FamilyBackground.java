package models;

import java.io.Serializable;

public class FamilyBackground implements Serializable {
	
	private String familyid;
	private String userid;
	private String givenname;
	private String lastname;
	private String middlename;
	private String civilstatus;
	private String annualincome;
	private String employeeofuniversity;
	private String universityofemployment;
	private String role;
	private String relationship;

	public FamilyBackground(){
		
	}
	
	public FamilyBackground(String familyid,String userid,String givenname, String lastname, String middlename, String civilstatus, String annualincome, String employeeofuniversity, String universityofemployment, String role, String relationship){
		this.familyid = familyid;
		this.givenname = givenname;
		this.userid = userid;
		this.lastname = lastname;
		this.middlename = middlename;
		this.civilstatus = civilstatus;
		this.annualincome = annualincome;
		this.employeeofuniversity = employeeofuniversity;
		this.universityofemployment = universityofemployment;
		this.role = role;
		this.relationship = relationship;
	}

	public String getFamilyid() {
		return familyid;
	}

	public void setFamilyid(String familyid) {
		this.familyid = familyid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getGivenname() {
		return givenname;
	}

	public void setGivenname(String givenname) {
		this.givenname = givenname;
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

	public String getCivilstatus() {
		return civilstatus;
	}

	public void setCivilstatus(String civilstatus) {
		this.civilstatus = civilstatus;
	}

	public String getAnnualincome() {
		return annualincome;
	}

	public void setAnnualincome(String annualincome) {
		this.annualincome = annualincome;
	}

	public String getEmployeeofuniversity() {
		return employeeofuniversity;
	}

	public void setEmployeeofuniversity(String employeeofuniversity) {
		this.employeeofuniversity = employeeofuniversity;
	}

	public String getUniversityofemployment() {
		return universityofemployment;
	}

	public void setUniversityofemployment(String universityofemployment) {
		this.universityofemployment = universityofemployment;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
}
