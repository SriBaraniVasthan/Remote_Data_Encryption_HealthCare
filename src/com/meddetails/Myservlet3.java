package com.meddetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet3
 */
public class Myservlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Myservlet3() {
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
		 String unop=request.getParameter("UNOP");
		 String sys=request.getParameter("sys");
		 String dia=request.getParameter("dia");
		
		try {
			encr d4=CryptographyUtil.encrypt(id);
			String en_id=d4.getEncry();
			encr d = CryptographyUtil.encrypt(unop);
			String en_unop=d.getEncry();
			encr d2=CryptographyUtil.encrypt(sys);
			String en_sys=d2.getEncry();
			encr d3=CryptographyUtil.encrypt(dia);
			String en_dia=d3.getEncry();
			patient p1=new patient(id,en_unop,en_sys,en_dia);
			System.out.println("hello"+id);
			 if(id!=null)
			 {
			 patient p2=new patient(id,unop,sys, dia);
			 Patientdb pdb=new Patientdb();
			 pdb.updatedetailsofpatient(p2);
			 if(pdb.updatedtailsofpatient(p1))
			 {
				
				 out.println("<h2>UPDATED SUCCESSFULLY</h2>");
			 }
			 else
			 {
				 out.println("<h2>CANNOT UPDATE</h2>");
			 }
			 }
			 else
			 {
				 out.println("ENTER ID AND PASSWORD");
			 }
			 
		
			
		
		
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		 out.println("<a href='mainpage.html'>LOGOUT</a>");
		 out.println("</body></html>");
		 
		
	}

}
