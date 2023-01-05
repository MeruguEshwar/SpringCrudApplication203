package com.spring.ojas.SpringGitPractise.studentDao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.ojas.SpringGitPractise.model.Student;
@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void updateStudent(Student student) {
		hibernateTemplate.saveOrUpdate(student);
		
	}

	@Override
	public void deleteStudent(int studentId) {
		Student student=hibernateTemplate.get(Student.class, studentId);
		hibernateTemplate.delete(student);
		
	}

	@Override
	public List<Student> getAllStudents() {
	  
		return hibernateTemplate.loadAll(Student.class);
	}

	@Override
	public Student getById(int studentId) {
		
		return hibernateTemplate.get(Student.class, studentId);
	}

}
