package com.doctor.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	@Id
	private int doctorId;
	private String  name;
	private String  department;
	private String  specialization;
	private int experience;
	
	public Doctor() {
		super();
		
	}

	public Doctor(int doctorId, String name, String department, String specialization, int experience) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.department = department;
		this.specialization = specialization;
		this.experience = experience;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", name=" + name + ", department=" + department + ", specialization="
				+ specialization + ", experience=" + experience + "]";
	}
	
	
	
}
