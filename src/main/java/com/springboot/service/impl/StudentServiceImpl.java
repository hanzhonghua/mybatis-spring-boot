package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mapper.StudentMapper;
import com.springboot.pojo.Student;
import com.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public List<Student> likeName(String name) {
		return studentMapper.likeName(name);
	}

	@Override
	public Student getById(int id) {
		return studentMapper.getById(id);
	}

	@Override
	public void addStudent(Student s) throws Exception {
		
		studentMapper.addStudent(s);
		/*int a =1/0;
		System.out.println(a);*/
	}

	@Override
	public List<Student> list() {
		return studentMapper.list();
	}
	
}
