package com.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.ui.ModelMap;

import com.tutorialspoint.Student;
import com.tutorialspoint.StudentController;

public class StudentControllerTest {

	@Test
	public void test() {
		Student student = new Student();
		ModelMap model = new ModelMap();
		
		
		student.setName("lorem");
		student.setId(12);
		student.setAge(22);

		model.addAttribute("name", student.getName());
		model.addAttribute("id", student.getId());
		model.addAttribute("age", student.getAge());
		
		
		StudentController obj = new StudentController();
		assertEquals("resuwlt", obj.addStudent(student, model));
	}

}
