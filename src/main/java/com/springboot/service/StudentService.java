package com.springboot.service;

import java.util.List;

import com.springboot.pojo.Student;

public interface StudentService {

	List<Student> likeName(String name);

	Student getById(int id);

	void addStudent(Student s) throws Exception;

	List<Student> list();

	List<Student> list(Student s);

}
