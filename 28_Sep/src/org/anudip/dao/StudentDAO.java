package org.anudip.dao;
import java.util.HashSet;
import org.anudip.model.Student;

public class StudentDAO {
	private static HashSet<Student> studentHashSet= new HashSet<Student>();
	public boolean addStudent(Student student) {
	//public void addStudent(Student student) {
		studentHashSet.add(student);
		System.out.println(studentHashSet);
		return true;
	}
	public static HashSet<Student>getStudents(){
		return studentHashSet;
	}

}
