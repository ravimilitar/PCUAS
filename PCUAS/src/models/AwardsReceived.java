package models;

import java.io.Serializable;

public class AwardsReceived implements Serializable{
	
	private String awardsid;
	private String userid;
	private String name;
	private String description;

	public AwardsReceived(){
		
	}
	
	public AwardsReceived(String awardsid, String userid, String name, String description){
		this.awardsid = awardsid;
		this.userid = userid;
		this.name = name;
		this.description = description;
	}

	public String getAwardsid() {
		return awardsid;
	}

	public void setAwardsid(String awardsid) {
		this.awardsid = awardsid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
