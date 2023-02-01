package com.meddetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet2
 */
public class Myservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet2() {
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
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String city=request.getParameter("city");
		String bgroup=request.getParameter("bgroup");
		String gender=request.getParameter("gender");
		String password=request.getParameter("password");
		
		try {
			encr d1=CryptographyUtil.encrypt(id);
			String en_id=d1.getEncry();
			encr d2=CryptographyUtil.encrypt(name);
			String en_name=d2.getEncry();
			encr d3=CryptographyUtil.encrypt(age);
			String en_age=d3.getEncry();
			encr d4=CryptographyUtil.encrypt(city);
			String en_city=d4.getEncry();
			encr d5=CryptographyUtil.encrypt(bgroup);
			String en_bgroup=d5.getEncry();
			encr d6=CryptographyUtil.encrypt(gender);
			String en_gender=d6.getEncry();
			encr d7=CryptographyUtil.encrypt(password);
			String en_password=d7.getEncry();
			patient p2=new patient(en_id, en_password, en_name, en_age, en_bgroup, en_gender, en_city,id);
			System.out.println(p2.getPatientid());
		
		
	
		Patientdb pdb=new Patientdb();
		patient p1=new patient(id,password,name,age,bgroup,gender,city);
		pdb.addpatient(p1);
		if(pdb.addpatientencrypted(p2))
		{
			
			out.println("<h2>Patient added successfully</h2>");
			}
		out.println("<a href='mainpage.html'>LOGOUT</a>");
		out.println("</body></html>");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}}
