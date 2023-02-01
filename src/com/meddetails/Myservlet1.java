package com.meddetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet1
 */
public class Myservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body style='background-color:cyan'>");
		String id=request.getParameter("patientid");
		Patientdb pdb=new Patientdb();
		patient temp=new patient();
		patient p=new patient(id);
		temp=pdb.getthedetailsofpatient(p);
		if(temp.getPatientid()=="0")
		{
			out.println("<h2>INVALID CREDENTIALS</h2>");
		}
		else
		{   out.println("<center>");
			out.println("<h2>DETAILS</h2><table>");
			out.println("<tr><td><h2> ID:</td><td><h2>"+temp.getPatientid()+"</h2></h2></td></tr>");
			out.println("<tr><td><h2> NAME:</td><td><h2>"+temp.getPatientname()+"</h2></h2></td></tr>");
			out.println("<tr><td><h2> AGE:</td><td><h2>"+temp.getAge()+"</h2></h2></td></tr>");
			out.println("<tr><td><h2> GENDER:</td><td><h2>"+temp.getGender()+"</h2></h2></td></tr>");
			out.println("<tr><td><h2> BLOOD GROUP:</td><td><h2>"+temp.getBloodgroup()+"</h2></h2></td></tr>");
			out.println("<tr><td><h2> CITY:</td><td><h2>"+temp.getCity()+"</h2></h2></td></tr>");
			out.println("<tr><td><h2> UNDERGONE OPERATION:</td><td><h2>"+temp.getUndergoneoperation()+"</h2></h2></td></tr>");
			out.println("<tr><td><h2> SYSTOLE:</td><td><h2>"+temp.getHeartratesystole()+"</h2></h2></td></tr>");
			out.println("<tr><td><h2> DIASTOLE:</td><td><h2>"+temp.getHeartratediastole()+"</h2></h2></td></tr>");
			out.println("</table>");
		}
		out.println("<a href='mainpage.html'>LOGOUT</a>");
		out.println("</body></html>");
	}


}