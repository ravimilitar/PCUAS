package models;

import java.io.Serializable;


public class Transcripts implements Serializable{
	
	private String transcriptid;
	private String userid;
	private String name;
	private String fileurl;
	
	public Transcripts(){
		
	}
	
	public Transcripts(String transcriptid, String userid, String name, String fileurl){
		this.transcriptid = transcriptid;
		this.userid = userid;
		this.name = name;
		this.fileurl = fileurl;
	}

	public String getTranscriptid() {
		return transcriptid;
	}

	public void setTranscriptid(String transcriptid) {
		this.transcriptid = transcriptid;
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

	public String getFileurl() {
		return fileurl;
	}

	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}

}
