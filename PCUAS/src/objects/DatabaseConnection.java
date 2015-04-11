package objects;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

import models.*;

public class DatabaseConnection {
	private static DatabaseQuery userQuery = new DatabaseQuery("Users");
	private static DatabaseQuery hsQuery = new DatabaseQuery("HighSchoolInformation");
	private static DatabaseQuery guiQuery = new DatabaseQuery("GeneralUserInformation");
	private static DatabaseQuery addressQuery = new DatabaseQuery("Address");
	private static DatabaseQuery awardsQuery = new DatabaseQuery("AwardsReceived");
	private static DatabaseQuery citizenshipQuery = new DatabaseQuery("Citizenship");
	private static DatabaseQuery contactQuery = new DatabaseQuery("ContactDetails");
	private static DatabaseQuery declarationsQuery = new DatabaseQuery("Declarations");
	private static DatabaseQuery familyQuery =  new DatabaseQuery("FamilyBackground");
	private static DatabaseQuery orgQuery = new DatabaseQuery("Organizations");
	private static DatabaseQuery refQuery = new DatabaseQuery("Referrers");
	private static DatabaseQuery transQuery = new DatabaseQuery("Transcripts");
	
	public static ArrayList<User> getAllUsers(){
		ArrayList<User> usersList = new ArrayList<User>();
		
		ArrayList<Properties> result = userQuery.select("*");
		
		for(Properties p: result){
			usersList.add(new User(
						p.getProperty("userid"),
						p.getProperty("username"),
						p.getProperty("password"),
						p.getProperty("email")
					));
			
		}
		
		return usersList;
		
	}
	public static String getUserID(String username){
		ArrayList<Properties> result = userQuery.select("userid", "username='"+username+"'");
		
		return result.get(0).getProperty("userid");
	}
	
	public static boolean addUser(User user){
		boolean temp= userQuery.insert("('"
				+ user.getUsername()+"', '"
				+ user.getPassword()+"', '"
				+ user.getEmail()+"', "
				+ "default"
				+")") ;
		
		String userID = getUserID(user.getUsername());
		
		return temp
				&&hsQuery.insert("(userid, yearlevel)", "("+userID+", 1)")
				&& hsQuery.insert("(userid, yearlevel)", "("+userID+", 2)")
				&& hsQuery.insert("(userid, yearlevel)", "("+userID+", 3)")
				&& hsQuery.insert("(userid, yearlevel)", "("+userID+", 4)")
		
		
				&& guiQuery.insert("(userid)", "("+userID+")")
				&& citizenshipQuery.insert("(userid)",  "("+userID+")")
				&& contactQuery.insert("(userid)",  "("+userID+")")
				
				&& addressQuery.insert("(userid, type)", "("+userID+", 'permanent')")
				&& addressQuery.insert("(userid, type)", "("+userID+", 'current')")
				&& addressQuery.insert("(userid, type)", "("+userID+", 'mailing')")
		
				&& familyQuery.insert("(userid, role)", "("+userID+", 'mother')")
				&& familyQuery.insert("(userid, role)", "("+userID+", 'father')")
				&& familyQuery.insert("(userid, role)", "("+userID+", 'guardian')")
				
				&& declarationsQuery.insert("(userid)", "("+userID+")");
				
//				&& refQuery.insert("(userid, type)", "("+userID+", 'guardian')")
//				&& refQuery.insert("(userid, type)", "("+userID+", 'guardian')")
				
				
				
		
	}
	
	
	
	public static Address getAddress(String userID, String type){
		Properties p = addressQuery.select("*", "userid = " + userID + " AND type = '"+type+"'").get(0);
		
		return new Address(
					p.getProperty("addressid"),
					p.getProperty("userid"),
					p.getProperty("unit"),
					p.getProperty("street"),
					p.getProperty("district"),
					p.getProperty("country"),
					p.getProperty("postalcode"),
					p.getProperty("telephone"),
					p.getProperty("type")
				);
	}
	public static boolean updateAddress(Address address){
		return addressQuery.update(
					"unit = '" + address.getUnit() + "', " +
					"street = '" + address.getStreet() + "', " + 
					"district = '" +  address.getDistrict() + "', " +
					"country = '" + address.getCountry() + "', " +
					"postalcode = '" + address.getPostalcode() + "', " +
					"telephone = '" + address.getTelephone() + "', " +
					"type = '" + address.getType() + "', "
					,"addressid = '" + address.getAddressid() + "'");
	}
	

	public static ArrayList<AwardsReceived> getAwards(String userID){
		ArrayList<AwardsReceived> awardsList = new ArrayList<AwardsReceived>();
		
		ArrayList<Properties> result = awardsQuery.select("*", "userid = '" + userID + "'");
		
		for(Properties p: result){
			awardsList.add(new AwardsReceived(
					p.getProperty("awardsid"),
					p.getProperty("userid"),
					p.getProperty("name"),
					p.getProperty("description")
				));
		}
				
		return awardsList;
	}
	public static boolean addAward(AwardsReceived award){
		return awardsQuery.insert(
				"('" + award.getUserid() + "', '"
				+ award.getName() + "', '" + award.getDescription() + "')");
	}
	public static boolean updateAward(AwardsReceived awards){
		return awardsQuery.update(
					"name = '" + awards.getName() + "', " +
					"description = '" + awards.getDescription() + "'"
				, "awardsid = '" + awards.getAwardsid() + "'");
	}
	public static boolean deleteAward(String key){
		return awardsQuery.delete("awardsid = "+key);
	}
	
	
	
	public static Citizenship getCitizenship(String userID){
		ArrayList<Properties> result = citizenshipQuery.select( "*", "userid =" + userID);
		
		return new Citizenship(
				result.get(0).getProperty("citizenshipid"),
				result.get(0).getProperty("userid"),
				result.get(0).getProperty("citizenshipcountry"),
				result.get(0).getProperty("dualcitizenship"),
				result.get(0).getProperty("pobcity"),
				result.get(0).getProperty("pobprovince"),
				result.get(0).getProperty("pobcountry")
				
				);
	}
	public static boolean updateCitizenship(Citizenship citizenship){
		return citizenshipQuery.update(
					"citizenshipcountry = '" + citizenship.getCitizenshipcountry() + "', " +
				    "dualcitizenship = '" + citizenship.getDualcitizenship() + "', " +
					"pobcity = '" + citizenship.getPobcity() + "', " +
				    "pobprovince = '" + citizenship.getPobprovince() + "', " +
					"pobcountry = '" +  citizenship.getPobcountry() + "'" 
					, "citizenshipid = " + citizenship.getCitizenshipid());
	}
	
	
	public static ContactDetails getContactDetails(String userID){
		ArrayList<Properties> result = contactQuery.select("*", "userid = " + userID);
		
		return new ContactDetails(
				result.get(0).getProperty("contactid"),
				result.get(0).getProperty("userid"),
				result.get(0).getProperty("mobilephone")
				);
	}
	public static boolean updateContactDetails(ContactDetails contactDetails){
		return contactQuery.update(
					"mobilephone = '" + contactDetails.getMobilephone() + "'" 
				, "contactid = '" + contactDetails.getContactid() + "'");
	}
	
	
	public static Declarations getDeclarations(String userID){
		ArrayList<Properties> result = declarationsQuery.select("*", "userid = " + userID);
		
		return new Declarations(
				result.get(0).getProperty("declarationsid"),
				result.get(0).getProperty("userid"),
				result.get(0).getProperty("submitsat"),
				result.get(0).getProperty("financed"),
				result.get(0).getProperty("physicalcondition"),
				result.get(0).getProperty("behavioralcondition"),
				result.get(0).getProperty("disciplinaryaction")
				);
	}
	public static boolean updateDeclarations(Declarations dc){
		return declarationsQuery.update(
					"submitsat = '"+ dc.getSubmitsat()  + "', " +
					"financed = '"+ dc.getFinanced()  + "', " +
					"physicalcondition = '"+ dc.getPhysicalcondition()  + "', " +
					"behavioralcondition = '"+ dc.getBehavioralcondition()  + "', " +
					"disciplinaryaction = '"+ dc.getDisciplinaryaction() + "'"
				, "declarationsid = '" + dc.getDeclarationsid() + "'");
	}
	
	
	public static FamilyBackground getFamilyBackground(String userID, String type){
		Properties p = familyQuery.select("*", "userid = " + userID + " AND role = '" + type + "'").get(0);
		
		return new FamilyBackground(
					p.getProperty("familyid"),
					p.getProperty("userid"),
					p.getProperty("givenname"),
					p.getProperty("lastname"),
					p.getProperty("middlename"),
					p.getProperty("civilstatus"),
					p.getProperty("annualincome"),
					p.getProperty("employeeofuniversity"),
					p.getProperty("universityofemployment"),
					p.getProperty("role"),
					p.getProperty("relationship")
				);
	}
	public static boolean updateFamilyBackground(FamilyBackground fb){
		return familyQuery.update(
					"givenname = '" + fb.getGivenname() + "', " +
					"lastname = '" + fb.getLastname() + "', " +
					"middlename = '" + fb.getMiddlename() + "', " +
					"civilstatus = '" + fb.getCivilstatus() + "', " +
					"annualincome = '" + fb.getAnnualincome() + "', " +
					"employeeofuniversity = '" + fb.getEmployeeofuniversity() + "', " +
					"universityofemployment = '" + fb.getUniversityofemployment() + "', " +
					"relationship = '" + fb.getRelationship() + "', " +
					"role = '" + fb.getRole() + "'"
				, "familyid = '" + fb.getFamilyid() + "'");
	}
	
	
	
	public static GeneralUserInformation getGeneralUserInformation(String userID){
		ArrayList<Properties> result = guiQuery.select("*", "userid = "+userID);
		
		
		return new GeneralUserInformation(
					result.get(0).getProperty("guserinfoid"),
					result.get(0).getProperty("userid"),
					result.get(0).getProperty("firstname"),
					result.get(0).getProperty("lastname"),
					result.get(0).getProperty("middlename"),
					result.get(0).getProperty("nickname"),
					result.get(0).getProperty("gender"),
					result.get(0).getProperty("religion"),
					result.get(0).getProperty("civilstatus"),
					result.get(0).getProperty("birthday"),
					result.get(0).getProperty("birthmonth"),
					result.get(0).getProperty("birthyear"),
					result.get(0).getProperty("livingwithparents")
				);
	}
	public static boolean updateGeneralUserInformation(GeneralUserInformation gen){
		return guiQuery.update(	
					"firstname = '" + gen.getFirstname() + "', " +
					"lastname = '" + gen.getLastname() + "', " + 
					"middlename = '" + gen.getMiddlename() + "', " +
					"nickname = '" + gen.getNickname() + "', " +
					"gender = '" + gen.getGender() + "', " +
					"birthday = '" + gen.getBirthday() + "', " +
					"birthmonth = '" + gen.getBirthmonth() + "', " +
					"birthyear = '" + gen.getBirthyear() + "', " +
					"religion = '" + gen.getReligion() + "', " +
					"livingwithparents = '" + gen.getLivingwithparents() + "', " +
					"civilstatus = '" + gen.getCivilstatus()+"'"
			, "guserinfoid = '" + gen.getGuserinfoid() + "'");
		
	}
	
	
	public static HighSchoolInformation[] getHighSchoolInformation(String userID){
		HighSchoolInformation[] hsInfo = new HighSchoolInformation[4];
		ArrayList<Properties> result = hsQuery.select("*", "userid="+userID, "yearlevel");
		
		for(int i=0; i<4; i++){
			hsInfo[i] = new HighSchoolInformation(
					result.get(i).getProperty("hsinfoid")
					,result.get(i).getProperty("userid")
					,result.get(i).getProperty("schoolname")
					,result.get(i).getProperty("country")
					,result.get(i).getProperty("schoolyear")
					,result.get(i).getProperty("address")
					,result.get(i).getProperty("yearlevel")
					);
		}
		
		return hsInfo;
	}
	public static boolean updateHighSchoolInformation(HighSchoolInformation hsInfo){
		return hsQuery.update(
						"address='"+hsInfo.getAddress()+"',"
						+ "country='"+hsInfo.getCountry()+"',"
						+ "schoolname='"+hsInfo.getSchoolname()+"',"
						+ "schoolyear='"+hsInfo.getSchoolyear()+"'"
				, "hsinfoid = '"+hsInfo.getHsinfoid() + "'");
	}
	
	
	public static ArrayList<Organizations> getOrganizations(String userID){
		ArrayList<Organizations> orgList = new ArrayList<Organizations>();
		
		ArrayList<Properties> result = orgQuery.select("*", "userid = " + userID);
		
		for(Properties p: result){
			orgList.add(new Organizations(
					p.getProperty("orgid"),
					p.getProperty("userid"),
					p.getProperty("orgname"),
					p.getProperty("role"),
					p.getProperty("description")
				));
		}
		
		return orgList;
	}
	public static boolean addOrganization(Organizations organization){
		return false;
	}
	public static boolean updateOrganization(Organizations org){
		return orgQuery.update(
					"orgname = '" + org.getOrgname() + "', " +
					"description = '"+ org.getDescription() + "', " +
					"role = '" + org.getRole() + "'"
				, "orgid = '" + org.getOrgid() + "'");
	}
	public static boolean deleteOrganization(String key){
		return orgQuery.delete("userid = " + key);
	}
	
	
	public static Referrers[] getReferrer(String userID){
		Referrers[] ref = new Referrers[2];
		ArrayList<Properties> result = refQuery.select("*", "userid = '" + userID + "'");
		
		for(int i = 0; i < 2; i++){
			ref[i] = new Referrers(
					result.get(i).getProperty("referrerid"),
					result.get(i).getProperty("userid"),
					result.get(i).getProperty("firstname"),
					result.get(i).getProperty("lastname"),
					result.get(i).getProperty("email"),
					result.get(i).getProperty("organization"),
					result.get(i).getProperty("position"),
					result.get(i).getProperty("mobile")
					);
		}

		return ref;
	}
	public static boolean updateReferrers(Referrers ref){
		return refQuery.update(
					"firstname = '"+ ref.getFirstname() + "', " +
					"lastname = '"+ ref.getLastname() + "', " +
					"email = '"+ ref.getEmail() + "', " +
					"organization = '"+ ref.getOrganization() + "', " +
					"position = '"+ ref.getPosition() + "', " +
					"mobile = '" + ref.getMobile() + "'"
				, "referrerid = '" + ref.getReferrerid() + "'");
	}
	
	
	public static ArrayList<Transcripts> getTranscripts(String userID){
		ArrayList<Transcripts> transList = new ArrayList<Transcripts>();
		
		ArrayList<Properties> result = transQuery.select("*", "userid = " + userID);
		
		for(Properties p: result){
			transList.add(new Transcripts(
					p.getProperty("transcriptid"),
					p.getProperty("userid"),
					p.getProperty("name"),
					p.getProperty("fileurl")
				));
		}
		
		return transList;
	}
	public static boolean addTranscript(Transcripts trans){
		return transQuery.insert("(" + trans.getUserid() + ", '" + trans.getName() + "', '" + trans.getFileurl() + "')");
	}
	public static boolean updateTranscript(Transcripts trans){
		return transQuery.update(
					"name = '"+ trans.getName() + "', " +
					"fileurl = '"+ trans.getFileurl() + "'"
				, "transcriptid = '" + trans.getTranscriptid() + "'");
	}
	public static boolean deleteTranscript(String key){
		return transQuery.delete("userid = " + key);
	}
	
	
	

}
