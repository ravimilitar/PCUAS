package models;

import java.io.Serializable;

public class Address implements Serializable {
	
	private String addressid;
	private String userid;
	private String unit;
	private String street;
	private String district;
	private String country;
	private String postalcode;
	private String telephone;
	private String type;

	public Address(){
		
	}
	
	public Address(String addressid, String userid, String unit, String street, String district, String country, String postalcode, String telephone, String type){
		this.addressid = addressid;
		this.userid = userid;
		this.unit = unit;
		this.street = street;
		this.district = district;
		this.country = country;
		this.postalcode = postalcode;
		this.telephone = telephone;
		this.type = type;
	}

	public String getAddressid() {
		return addressid;
	}

	public void setAddressid(String addressid) {
		this.addressid = addressid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
