package com.spring.ojas.SpringGitPractise.studentDao;

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

}
