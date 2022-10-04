package org.anudip.service;

import java.util.HashSet;

import org.anudip.dao.StudentDAO;
import org.anudip.model.Student;
public class StudentService {
	StudentDAO studentDAO=new StudentDAO();
	public boolean addStudentService(Student student) {
		return studentDAO.addStudent(student);
	}
	public HashSet<Student> getStudentService(){
		return StudentDAO.getStudents();
	}

}
