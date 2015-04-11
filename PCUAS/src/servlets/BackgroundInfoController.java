package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import objects.DatabaseConnection;
import models.*;

/**
 * Servlet implementation class BackgroundInfoController
 */
@WebServlet("/BackgroundInfoController")
public class BackgroundInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BackgroundInfoController() {
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
		// TODO Auto-generated method stub
		
		//GENERAL USER INFORMATION
		GeneralUserInformation gui = (GeneralUserInformation)request.getSession().getAttribute("gUInfo");
		
		
		gui.setFirstname(request.getParameter("firstname"));
		gui.setMiddlename(request.getParameter("middlename"));
		gui.setLastname(request.getParameter("lastname"));
		gui.setNickname(request.getParameter("nickname"));
		gui.setBirthdate(request.getParameter("dateofbirth"));
		
		if(request.getParameter("gender") != null)
			gui.setGender(request.getParameter("gender"));
		
		if(request.getParameter("civilstatus") != null)
			gui.setCivilstatus(request.getParameter("civilstatus"));
		
		if(request.getParameter("religion") != null)
			gui.setReligion(request.getParameter("religion"));
		
		if(request.getParameter("livingwithparents") != null){
			gui.setLivingwithparents(request.getParameter("livingwithparents"));
		}
		request.getSession().setAttribute("gUInfo", gui);
		
		System.out.println("Updated GUInfo: "+DatabaseConnection.updateGeneralUserInformation(gui));
		
		//CITIZENSHIP
		Citizenship citizen = (Citizenship)request.getSession().getAttribute("citizenship");
		
		citizen.setPobcity(request.getParameter("pobcity"));
		citizen.setPobprovince(request.getParameter("pobprovince"));
		
		if(request.getParameter("pobcountry") != null)
			citizen.setPobcountry(request.getParameter("pobcountry"));
		
		if(request.getParameter("citizenshipcountry") != null)
			citizen.setCitizenshipcountry(request.getParameter("citizenshipcountry"));
		
		
		if(request.getParameter("dualcitizenship")!=null)
			citizen.setDualcitizenship(request.getParameter("dualcitizenship"));
		
		System.out.println("Updated Citizenship: "+DatabaseConnection.updateCitizenship(citizen));
		
		request.getSession().setAttribute("citizenship", citizen);
		
		//CONTACT DETAILS
		ContactDetails contactdetails = (ContactDetails)request.getSession().getAttribute("contactDetails");
		
		contactdetails.setMobilephone(request.getParameter("mobilephone"));
		
		System.out.println("Updated ContactDetails: "+DatabaseConnection.updateContactDetails(contactdetails));
		
		request.getSession().setAttribute("citizenship", citizen);
		
		//DECLARATIONS
		Declarations declarations = (Declarations)request.getSession().getAttribute("declaration");
		
		
		if(request.getParameter("sat") !=null)
			declarations.setSubmitsat(request.getParameter("sat"));
		
		if(request.getParameter("finance") !=null)
			declarations.setFinanced(request.getParameter("finance"));
		
		if(request.getParameter("physical-condition") !=null)
			declarations.setPhysicalcondition(request.getParameter("physical-condition"));
		
		if(request.getParameter("behavioral-condition") !=null)
			declarations.setBehavioralcondition(request.getParameter("behavioral-condition"));
		
		if(request.getParameter("disciplinary-action") !=null)
			declarations.setDisciplinaryaction(request.getParameter("disciplinary-action"));
		
		System.out.println("Updated Declarations: "+DatabaseConnection.updateDeclarations(declarations));
		
		request.getSession().setAttribute("declaration", declarations);
		
		response.sendRedirect("background_info.jsp");
		
				
	}

}
