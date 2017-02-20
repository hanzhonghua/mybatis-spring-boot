package com.springboot.mapper;

import java.util.List;

import com.springboot.pojo.Student;

public interface StudentMapper/* extends MyMapper */{

	List<Student> likeName(String name);
	Student getById(int id);
	String getNameById(int id);
	void addStudent(Student s);
	List<Student> list();
	List<Student> someList(Student s);
}
