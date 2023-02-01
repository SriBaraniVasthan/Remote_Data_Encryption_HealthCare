package com.meddetails;

public class Patientdb {
	
	public boolean addpatient(patient p)
	{
		Patientdao pd=new Patientdao();
		return pd.addpatient(p);
	}
	
	public patient getthedetailsofpatient(patient p)
	{
		Patientdao pd=new Patientdao();
		return pd.getthedetailsofpatient(p);
	}
	
	public boolean updatedetailsofpatient(patient pa)
	{
		Patientdao pd=new Patientdao();
		return pd.updatedetailsofpatient(pa);
	}
	
	public boolean addpatientencrypted(patient p)
	{
		Patientdao pd=new Patientdao();
		return pd.addpatientencryted(p);
	}
	
	public boolean updatedtailsofpatient(patient pa)
	{
		Patientdao pd=new Patientdao();
		return pd.updatedtailsofpatient(pa);
	}
	
	
}

