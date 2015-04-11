package models;

import java.io.Serializable;

public class Organizations implements Serializable{
	
	private String orgid;
	private String userid;
	private String orgname;
	private String role;
	private String description;
	
	public Organizations(){
		
	}
	
	public Organizations(String orgid, String userid, String orgname, String role, String description){
		this.orgid = orgid;
		this.userid = userid;
		this.orgname = orgname;
		this.role = role;
		this.description = description;
		
	}

	public String getOrgid() {
		return orgid;
	}

	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
