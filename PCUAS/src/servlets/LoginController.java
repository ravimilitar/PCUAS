package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import objects.DatabaseConnection;
import models.*;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usernameParameter = request.getParameter("username");
		String passwordParameter = request.getParameter("password");
		
		//Check for username and password match
		boolean isMatch = false;
		ArrayList<User> usersList = DatabaseConnection.getAllUsers();
		
		for(User users: usersList){
			if(usernameParameter.equals(users.getUsername()) && passwordParameter.equals(users.getPassword())){
				isMatch = true;
				request.getSession().setAttribute("loggedUser", users);
				
				GeneralUserInformation gUInfo = DatabaseConnection.getGeneralUserInformation(users.getUserid());
				request.getSession().setAttribute("gUInfo", gUInfo);
				
				
				Citizenship citizenship = DatabaseConnection.getCitizenship(users.getUserid());
				request.getSession().setAttribute("citizenship", citizenship);
				
				ContactDetails contactDetails = DatabaseConnection.getContactDetails(users.getUserid());
				request.getSession().setAttribute("contactDetails", contactDetails);
				
				Address permanentAddress = DatabaseConnection.getAddress(users.getUserid(), "permanent");
				request.getSession().setAttribute("permanentAddress", permanentAddress);
				
				Address currentAddress = DatabaseConnection.getAddress(users.getUserid(), "current");
				request.getSession().setAttribute("currentAddress", currentAddress);
				
				Address mailingAddress = DatabaseConnection.getAddress(users.getUserid(), "mailing");
				request.getSession().setAttribute("mailingAddress", mailingAddress);
				
// 				AwardsReceived awards = new AwardsReceived (1,1, "a", "b");
// //				AwardsReceived awards = DatabaseConnection.getAwards(users.getUserid());				
// 				request.getSession().setAttribute("awards", awards);
				
				Declarations declaration = DatabaseConnection.getDeclarations(users.getUserid());
				request.getSession().setAttribute("declaration", declaration);
				
				FamilyBackground motherBackground = DatabaseConnection.getFamilyBackground(users.getUserid(), "mother");
				request.getSession().setAttribute("motherBackground", motherBackground);
				
				FamilyBackground fatherBackground = DatabaseConnection.getFamilyBackground(users.getUserid(), "father");
				request.getSession().setAttribute("fatherBackground", fatherBackground);
				
				FamilyBackground guardianBackground = DatabaseConnection.getFamilyBackground(users.getUserid(), "guardian");
				request.getSession().setAttribute("guardianBackground", guardianBackground);
				
				
 				HighSchoolInformation[] hsInfo = DatabaseConnection.getHighSchoolInformation(users.getUserid());
 				request.getSession().setAttribute("hsInfo", hsInfo);
				
// 				Organizations organizations = new Organizations (1,1,"a","b","c");
// //				Organizations organizations = DatabaseConnection.getOrganizations(users.getUserid());
// 				request.getSession().setAttribute("organizations", organizations);
				
// 				Referrers referrers = new Referrers (1,1, "a","b","c", "d", "e", "f");
// //				Referrers referrers = DatabaseConnection.getReferrers(users.getUserid());
// 				request.getSession().setAttribute("referrers", referrers);
				
// 				Transcripts transcripts = new Transcripts (1,1,"a", "b");
// //				Transcripts	transcripts = DatabaseConnection.getTranscripts(users.getUserid());
// 				request.getSession().setAttribute("transcripts", transcripts);
// 				break;
				
				break;
			}
				
		}
		
		if(isMatch)
			response.sendRedirect("home.jsp");
		else
			response.sendRedirect("index.jsp");
		
		
	}

}
