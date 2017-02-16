package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.springboot.pojo.Student;
import com.springboot.service.StudentService;

@Controller
public class StudentController extends BaseController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/likeName")
	@ResponseBody
	public List<Student> likeName(String name) {
		// 查询第一页，一页展示两条数据
		PageHelper.startPage(1, 2);
		return studentService.likeName(name);
	}

	@RequestMapping(value = "/getById")
	@ResponseBody
	public Student getById(int id) {
		Student s = studentService.getById(id);
		LOGGER.info("查询学生：" + s);
		return s;
	}

	@RequestMapping(value = "/addStudent")
	public void addStudent(Student s) {
		try {
			studentService.addStudent(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/list")
	@ResponseBody
	public List<Student> list() {
		// 查询第一页，一页展示两条数据
		PageHelper.startPage(1, 2);
		List<Student> list = studentService.list();
		return list;
	}
}
