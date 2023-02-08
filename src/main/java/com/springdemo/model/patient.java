package com.springdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class patient {

	@Id
	private int pid;
	private String patient_Name;
	private String fever_Type;
	private int age;
	
	
	public patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public patient(int pid, String patient_Name, String fever_Type, int age) {
		super();
		this.pid = pid;
		this.patient_Name = patient_Name;
		this.fever_Type = fever_Type;
		this.age = age;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPatient_Name() {
		return patient_Name;
	}
	public void setPatient_Name(String patient_Name) {
		this.patient_Name = patient_Name;
	}
	public String getFever_Type() {
		return fever_Type;
	}
	public void setFever_Type(String fever_Type) {
		this.fever_Type = fever_Type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "patient [pid=" + pid + ", patient_Name=" + patient_Name + ", fever_Type=" + fever_Type + ", age=" + age
				+ "]";
	}
	
}
