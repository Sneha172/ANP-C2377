package org.anudip.view;
import java.time.LocalDate;
import java.util.Scanner;

import org.anudip.exeception.StudentValidationException;
import org.anudip.model.Gender;
import org.anudip.model.Student;
import org.anudip.service.StudentService;

public class StudentView {
	StudentService studentService=new StudentService();
	Scanner scanner=new Scanner(System.in);
	static int studentIdCounter=1;
	public boolean validateGender(String gender) {
		boolean result=false;
		System.out.println(gender);
		for(Gender genderLocal:Gender.values()) {
			System.out.println(genderLocal);
			if(gender.toUpperCase().equals(genderLocal.toString())) {
				System.out.println("true block");
		        result=true;
			    break;
			}
		}
		return result;
	}
	
	public void acceptStudentDetails() {
		Gender gender;
		int input;
		do {
		System.out.println("Enetr student details");
		System.out.println("Enter student name:");
		String sname=scanner.nextLine();
		
		System.out.println("enter gernder"); //call validate gender method
		String genderString=scanner.nextLine();
		String genderUppercase=genderString.toUpperCase();
		if(!validateGender(genderUppercase))
			throw new StudentValidationException("give an appropreate gender");
		else
			gender=Gender.valueOf(genderUppercase);
		     System.out.println("Enter your dob(yyyy-mm-dd");
		     String dobString=scanner.nextLine();
		     LocalDate dob=LocalDate.parse(dobString);
		     System.out.println(dob);
		     Student student=new Student(studentIdCounter++,sname,gender,dob);
		     studentService.addStudentService(student);
		     System.out.println("Type 1 to add more student");
		     input = scanner.nextInt();
		     scanner.nextLine();
		     }while(input==1);
	}
	public void dispalyStudentDetails() {
		
	}

}
