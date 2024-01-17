package com.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.doctor.dao.DoctorDAO;
import com.doctor.pojo.Doctor;

@SpringBootTest
class SbDoctorApplicationTests {

	

	DoctorDAO dao=new DoctorDAO();
	Doctor bean=new Doctor(101,"kumar","neuro","neuro",3);
	

	@Test
	void testDao() {
		String expect="Inserted";
		 String result=dao.insert(bean);
		 assertEquals(expect, result);
		
	}

		
	}





