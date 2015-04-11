package models;

import java.io.Serializable;

public class Declarations implements Serializable {
	
	private String declarationsid;
	private String userid;
	private String submitsat;
	private String financed;
	private String physicalcondition;
	private String behavioralcondition;
	private String disciplinaryaction;
	
	public Declarations(){
		
	}
	
	public Declarations(String declarationsid, String userid, String submitsat, String financed, String physicalcondition, String behavioralcondition, String disciplinaryaction ){
		this.declarationsid = declarationsid;
		this.userid = userid;
		this.submitsat = submitsat;
		this.financed = financed;
		this.physicalcondition = physicalcondition;
		this.behavioralcondition = behavioralcondition;
		this.disciplinaryaction = disciplinaryaction;
	}

	public String getDeclarationsid() {
		return declarationsid;
	}

	public void setDeclarationsid(String declarationsid) {
		this.declarationsid = declarationsid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getSubmitsat() {
		return submitsat;
	}

	public void setSubmitsat(String submitsat) {
		this.submitsat = submitsat;
	}

	public String getFinanced() {
		return financed;
	}

	public void setFinanced(String financed) {
		this.financed = financed;
	}

	public String getPhysicalcondition() {
		return physicalcondition;
	}

	public void setPhysicalcondition(String physicalcondition) {
		this.physicalcondition = physicalcondition;
	}

	public String getBehavioralcondition() {
		return behavioralcondition;
	}

	public void setBehavioralcondition(String behavioralcondition) {
		this.behavioralcondition = behavioralcondition;
	}

	public String getDisciplinaryaction() {
		return disciplinaryaction;
	}

	public void setDisciplinaryaction(String disciplinaryaction) {
		this.disciplinaryaction = disciplinaryaction;
	}

}
