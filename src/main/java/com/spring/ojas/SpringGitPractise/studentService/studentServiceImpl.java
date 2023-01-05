package com.spring.ojas.SpringGitPractise.studentService;

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
	
}
