package com.spring.ojas.SpringGitPractise.studentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.ojas.SpringGitPractise.model.Student;
import com.spring.ojas.SpringGitPractise.studentDao.StudentDao;

public class studentServiceImpl implements studentService {
@Autowired
	private StudentDao dao;
	@Override
	public void updateStudent(Student student) {
		dao.updateStudent(student);
		
	}
	@Override
	public void deleteStudent(int studentId) {
		dao.deleteStudent(studentId);
		
	}
	@Override
	public List<Student> getAllStudents() {
		
		return dao.getAllStudents();
	}
	@Override
	public Student getById(int studentId) {
		
		return dao.getById(studentId);
	}
	
}
