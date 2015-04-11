package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import objects.DatabaseConnection;
import models.HighSchoolInformation;

/**
 * Servlet implementation class AcadInfoController
 */
@WebServlet("/AcadInfoController")
public class AcadInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcadInfoController() {
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
		
		HighSchoolInformation[] hsInfo = (HighSchoolInformation[])request.getSession().getAttribute("hsInfo");
		
		for(int i=0; i<4; i++){
			hsInfo[i].setAddress(request.getParameter("address"+(i+1)));
			hsInfo[i].setCountry(request.getParameter("country"+(i+1)));
			hsInfo[i].setSchoolname(request.getParameter("hs"+(i+1)));
			hsInfo[i].setSchoolyear(request.getParameter("year"+(i+1)));
			
			System.out.println("Updated HS"+(i+1)+": "+DatabaseConnection.updateHighSchoolInformation(hsInfo[i]));
		}
		
		
		response.sendRedirect("academic_info.jsp");
	}

}
