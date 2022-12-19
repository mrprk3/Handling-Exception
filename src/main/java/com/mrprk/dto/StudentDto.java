package com.mrprk.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mrprk.model.Student;

@Service
public class StudentDto {

	public List<Student> allStudent() {
		return StudentDto.loadStudent();
	}
	
	public int sizeOfStudent() {
		return loadStudent().size();
	}

	public static List<Student> loadStudent() {
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(new Student(1, "Jon", "USA"));
		student.add(new Student(2, "Rock", "IND"));
		student.add(new Student(3, "Anil", "US"));
		student.add(new Student(4, "Shan", "UK"));
		student.add(new Student(5, "Abheek", "AUS"));
		student.add(new Student(6, "Saiket", "USA"));
		student.add(new Student(7, "Bishal", "IND"));
		return student;

	}

}
