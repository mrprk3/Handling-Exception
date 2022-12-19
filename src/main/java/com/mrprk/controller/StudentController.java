package com.mrprk.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mrprk.dto.StudentDto;
import com.mrprk.exception.Response;
import com.mrprk.model.Student;

@RestController
public class StudentController {
	@Autowired
	StudentDto dao;

	@GetMapping("/std/{id}")
	public ResponseEntity<Response> getStudentById(@PathVariable int id) {
		if (dao.sizeOfStudent() < id) {
			Response response = new Response();
			response.setDate(new Date());
			response.setMessage("Data not Found");
			response.setStudent(null);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
		}
		List<Student> s = dao.loadStudent();
		Response response = new Response();
		response.setDate(new Date());
		response.setMessage("No Error Found");
		response.setStudent(s.get(id));
		return ResponseEntity.status(HttpStatus.OK).body(response);

	}

}
