package com.doctor;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctor.controller.DMSController;
import com.doctor.pojo.Doctor;



@SpringBootApplication
public class SbDoctorApplication {
	
	
	public  Doctor menu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id ,name,department , specialization , experience in years.");
		
		return new Doctor(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextInt());
	}

	public static void main(String[] args) {
		SpringApplication.run(SbDoctorApplication.class, args);
		
		SbDoctorApplication obj=new SbDoctorApplication();
		
		
		   Doctor bean =obj.menu();
		
		DMSController control=new DMSController();
		control.performInsert(bean);
	}

}
