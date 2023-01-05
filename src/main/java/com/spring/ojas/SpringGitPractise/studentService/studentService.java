package com.spring.ojas.SpringGitPractise.studentService;

import java.util.List;

import com.spring.ojas.SpringGitPractise.model.Student;

public interface studentService {
	public void updateStudent(Student student);
	public void deleteStudent(int studentId);
	public List<Student> getAllStudents();
	public Student getById(int studentId);
}
