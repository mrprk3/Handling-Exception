package com.mrprk.exception;

import java.util.Date;

import com.mrprk.model.Student;

import lombok.Data;

@Data
public class Response {
	
	private Date date;
	private String message;
	private Student student;

}
