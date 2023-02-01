package com.meddetails;

public class patient {

	private String patientid;
	private String password;
	private String temp;
	private String patientname;
	private String age;
	private String bloodgroup;
	private String gender;
	private String city;
	private String undergoneoperation;
	private String heartratesystole,heartratediastole;
	public patient(String patientid,String password, String patientname, String age,
			String bloodgroup, String gender, String city) {
		super();
		this.patientid = patientid;
		this.password=password;
		this.patientname = patientname;
		this.age = age;
		this.bloodgroup = bloodgroup;
		this.gender = gender;
		this.city = city;
		
		
	}
	public patient(String patientid,String password, String patientname, String age,
			String bloodgroup, String gender, String city,String temp) {
		super();
		this.patientid = patientid;
		this.password=password;
		this.patientname = patientname;
		this.age = age;
		this.bloodgroup = bloodgroup;
		this.gender = gender;
		this.city = city;
		this.temp = temp;
		
	}
	
	
	public String getTemp() {
		return temp;
	}


	public void setTemp(String temp) {
		this.temp = temp;
	}


	public patient(String patientid, String undergoneoperation,
			String heartratesystole, String heartratediastole) {
		super();
		this.patientid = patientid;
		
		this.undergoneoperation = undergoneoperation;
		this.heartratesystole = heartratesystole;
		this.heartratediastole = heartratediastole;
	}


	public patient(String patientid, String password) {
		super();
		this.patientid = patientid;
		this.password = password;
	}


	public patient() {
		super();
	}
	public String getPatientid() {
		return patientid;
	}
	public void setPatientid(String patientid) {
		this.patientid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUndergoneoperation() {
		return undergoneoperation;
	}
	public void setUndergoneoperation(String undergoneoperation) {
		this.undergoneoperation = undergoneoperation;
	}
	public String getHeartratesystole() {
		return heartratesystole;
	}
	public void setHeartratesystole(String heartratesystole) {
		this.heartratesystole = heartratesystole;
	}
	public String getHeartratediastole() {
		return heartratediastole;
	}
	public void setHeartratediastole(String heartratediastole) {
		this.heartratediastole = heartratediastole;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 
	@Override
	public String toString() {
		return "patient [patientid=" + patientid + ", patientname="
				+ patientname + ", age=" + age + ", bloodgroup=" + bloodgroup
				+ ", gender=" + gender + ", city=" + city
				+ ", undergoneoperation=" + undergoneoperation
				+ ", heartratesystole=" + heartratesystole
				+ ", heartratediastole=" + heartratediastole + "]";
	}


	public patient(String patientid) {
		super();
		this.patientid = patientid;
	}
	
	
	
	
	
}

