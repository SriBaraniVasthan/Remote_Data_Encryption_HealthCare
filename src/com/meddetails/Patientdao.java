package com.meddetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Patientdao {

	
	public boolean addpatient(patient p)
	{
		Connection con=null;
		PreparedStatement ps=null;
		int x=0;
	try {
		con=DatabaseUtil.getConnection();
		ps=con.prepareStatement("insert into patientcontent (patientid ,password,patientname,age,bloodgroup ,gender,city) values(?,?,?,?,?,?,?)");
	    ps.setString(1,p.getPatientid());
	    ps.setString(2, p.getPassword());
	    ps.setString(3,p.getPatientname());
	    ps.setString(4,p.getAge());
	    ps.setString(5,p.getBloodgroup());
	    ps.setString(6,p.getGender());
	    ps.setString(7,p.getCity());
	    x=ps.executeUpdate();
	   
	} catch (SQLException e) {
		return false;
	
	}finally
	{
		DatabaseUtil.closeConnection(con);
		DatabaseUtil.closeStatement(ps);
	}
	 return x>0;
	}
	
	public boolean addpatientencryted(patient p)
	{
		Connection con=null;
		PreparedStatement ps=null;
		int x=0;
	try {
		con=DatabaseUtil.getConnection();
		ps=con.prepareStatement("insert into patientcontentencrypted (patientid ,password,patientname,age,bloodgroup ,gender,city,patienid) values(?,?,?,?,?,?,?,?)");
	    ps.setString(1,p.getPatientid());
	    ps.setString(2, p.getPassword());
	    ps.setString(3,p.getPatientname());
	    ps.setString(4,p.getAge());
	    ps.setString(5,p.getBloodgroup());
	    ps.setString(6,p.getGender());
	    ps.setString(7,p.getCity());
	    ps.setString(8,p.getTemp());
	    x=ps.executeUpdate();
	   
	} catch (SQLException e) {
	     System.out.println(e.getMessage());
	
	}finally
	{
		DatabaseUtil.closeConnection(con);
		DatabaseUtil.closeStatement(ps);
	}
	 return x>0;
	}
	
	public patient getthedetailsofpatient(patient p)
	{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		patient pa =new patient();
		
		try {
			con=DatabaseUtil.getConnection();
			ps=con.prepareStatement("select * from patientcontent where patientid=?");
			ps.setString(1,p.getPatientid());
			rs=ps.executeQuery();	
		while(rs.next())
			{
				pa.setPatientid(rs.getString(1));
				pa.setPassword(rs.getString(2));
				pa.setPatientname(rs.getString(3));
				pa.setAge(rs.getString(4));
				pa.setBloodgroup(rs.getString(5));
				pa.setGender(rs.getString(6));
				pa.setCity(rs.getString(7));
				pa.setUndergoneoperation(rs.getString(8));
				pa.setHeartratesystole(rs.getString(9));
				pa.setHeartratediastole(rs.getString(10));
			}
			
			
		} catch (SQLException e) {
			throw new DataLayerException(e.getMessage());
		}finally
		{
			DatabaseUtil.closeConnection(con);
			DatabaseUtil.closeStatement(ps);
		}
		return pa;
		
	}
	
	public boolean updatedetailsofpatient(patient p)
	{
		Connection con=null;
		PreparedStatement ps=null;
		int x=0;
		con=DatabaseUtil.getConnection();
		
		try {
			con=DatabaseUtil.getConnection();
			ps=con.prepareStatement("update patientcontent set undergone_operation=?,heartrate_systole=?,heartrate_diastole=? where patientid=? ");
			ps.setString(4,p.getPatientid());
			ps.setString(1,p.getUndergoneoperation());
			ps.setString(2,p.getHeartratesystole());
			ps.setString(3,p.getHeartratediastole());
	        x=ps.executeUpdate();
	        
		} catch (SQLException e) {
			throw new DataLayerException(e.getMessage());
		}finally
		{
			DatabaseUtil.closeConnection(con);
			DatabaseUtil.closeStatement(ps);
		}
		return x>0;
	}
	
	public boolean updatedtailsofpatient(patient p)
	{
		Connection con=null;
		PreparedStatement ps=null;
		int x=0;
		con=DatabaseUtil.getConnection();
		
		try {
			con=DatabaseUtil.getConnection();
			ps=con.prepareStatement("update patientcontentencrypted set undergone_operation=?,heartrate_systole=?,heartrate_diastole=? where patienid=? ");
			ps.setString(4,p.getPatientid());
			ps.setString(1,p.getUndergoneoperation());
			ps.setString(2,p.getHeartratesystole());
			ps.setString(3,p.getHeartratediastole());
	        x=ps.executeUpdate();
	        
		} catch (SQLException e) {
			throw new DataLayerException(e.getMessage());
		}finally
		{
			DatabaseUtil.closeConnection(con);
			DatabaseUtil.closeStatement(ps);
		}
		return x>0;
	}
	
	
}

